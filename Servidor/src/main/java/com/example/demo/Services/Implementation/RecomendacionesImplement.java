package com.example.demo.Services.Implementation;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.LibroEntity;
import com.example.demo.Model.LibroDTO;
import com.example.demo.Repository.RecomendacionesRepository;
import com.example.demo.Services.RecomendacionesService;

@Service
public class RecomendacionesImplement implements RecomendacionesService{

	 @Autowired
	 private RecomendacionesRepository recomendacionesRepository;
	 
	@Override
	public List<LibroDTO> obtenerRecomendaciones(Long idUser) {
		 Set<LibroEntity> recomendaciones = new LinkedHashSet<>();

	        recomendaciones.addAll(recomendacionesRepository.recomendarPorSaga(idUser));

	        recomendaciones.addAll(recomendacionesRepository.recomendarPorAutor(idUser));

	        recomendaciones.addAll(recomendacionesRepository.recomendarPorGeneros(idUser));

	        List<LibroDTO> resultado = new ArrayList<>();

	        for (LibroEntity libro : recomendaciones) {

	            LibroDTO dto = new LibroDTO();
	            dto.setIdLibro(libro.getIdLibro());
	            dto.setTitulo(libro.getTitulo());
	            dto.setAutor(libro.getAutor());
	            dto.setEditorial(libro.getEditorial());
	            dto.setNumPaginas(libro.getNumPaginas());
	            dto.setSinopsis(libro.getSinopsis());
	            dto.setImagen(libro.getImagen());
	            dto.setFechaPublicacion(libro.getFechaPublicacion());
	            dto.setValoracion(libro.getValoracion());

	            resultado.add(dto);
	        }

	        return resultado;
	}

}
