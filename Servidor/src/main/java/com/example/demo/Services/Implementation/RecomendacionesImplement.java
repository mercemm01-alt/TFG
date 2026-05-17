package com.example.demo.Services.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Entity.UserGeneroEntity;
import com.example.demo.Model.ApiLibrosDTO;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Services.ApiLibrosService;
import com.example.demo.Services.RecomendacionesService;

@Service
public class RecomendacionesImplement implements RecomendacionesService{
	
	 @Autowired
	    private UserRepository userRepository;

	 @Autowired
	    private ApiLibrosService apiLibrosService;

	@Override
	public List<ApiLibrosDTO> obtenerRecomendaciones(Long idUser) {

	    UserEntity user = userRepository.findByIdUser(idUser).orElseThrow(() ->
	            new RuntimeException("Usuario no encontrado"));

	    List<List<ApiLibrosDTO>> listasGeneros = new ArrayList<>();

	    Set<String> idsLibros = new HashSet<>();

	    // Buscar libros de cada género
	    for(UserGeneroEntity ug : user.getUserGeneros()) {
	    	
	        String genero = ug.getGenero().getNombre();

	        List<ApiLibrosDTO> librosGenero = new ArrayList<>(apiLibrosService.buscarLibros(genero));
	        Collections.shuffle(librosGenero);
	        listasGeneros.add(librosGenero);
	    }

	    List<ApiLibrosDTO> recomendaciones = new ArrayList<>();

	    boolean quedanLibros = true;
	    while(quedanLibros){

	        quedanLibros = false;

	        for(List<ApiLibrosDTO> lista : listasGeneros){
	            if(!lista.isEmpty()){

	                ApiLibrosDTO libro = lista.remove(0);

	                if(!idsLibros.contains( libro.getApiLibrosId())){

	                    recomendaciones.add(libro);
	                    idsLibros.add(libro.getApiLibrosId());
	                }

	                quedanLibros = true;
	            }
	        }
	    }

	    return recomendaciones;
	}

}
