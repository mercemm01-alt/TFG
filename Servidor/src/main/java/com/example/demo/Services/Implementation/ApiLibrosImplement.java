package com.example.demo.Services.Implementation;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Model.ApiLibrosDTO;
import com.example.demo.Services.ApiLibrosService;


@Service
public class ApiLibrosImplement implements ApiLibrosService{
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<ApiLibrosDTO> buscarLibros(String nombre) {

	    try {
	        String busqueda = URLEncoder.encode(nombre, StandardCharsets.UTF_8);

	        String url = "https://openlibrary.org/search.json?q=" + busqueda;

	        Map respuesta = restTemplate.getForObject(url, Map.class);

	        List<Map<String,Object>> docs = (List<Map<String,Object>>) respuesta.get("docs");

	        if(docs == null) return new ArrayList<>();

	        // ordenar:  1- año reciente 2- popularidad

	        docs = docs.stream()

	        .sorted((a,b)->{
	        	
	        	Integer anoA = (Integer)a.getOrDefault("first_publish_year",0);
		        Integer anoB = (Integer)b.getOrDefault("first_publish_year",0);

	            Integer popA = (Integer)a.getOrDefault("want_to_read_count",0);
	            Integer popB = (Integer)b.getOrDefault("want_to_read_count",0);

	            // año primero
	            int compararPopularidad = anoB.compareTo(anoA);

	            if(compararPopularidad!=0) return compararPopularidad;

	            // si empatan -> popularidad
	            return popB.compareTo(popA);
	        })

	        .toList();

	        List<ApiLibrosDTO> libros = new ArrayList<>();

	        for(Map<String,Object> doc : docs){
	        	
	            ApiLibrosDTO libro = new ApiLibrosDTO();

	            Object key = doc.get("key");

	            if(key!=null){
	                libro.setApiLibrosId(key.toString());
	            }

	            libro.setTitulo((String) doc.get("title"));

	            List<String> autores = (List<String>) doc.get("author_name");

	            if(autores!=null){
	                autores= autores.stream() .limit(3) .toList();
	            }

	            libro.setAutores(autores);

	            libro.setGeneros(List.of(nombre));

	            Integer año = (Integer) doc.get("first_publish_year");

	            if(año!=null && año>=1990){
	                Integer coverId = (Integer) doc.get("cover_i");

	                if(coverId!=null){
	                    libro.setImagen("https://covers.openlibrary.org/b/id/" + coverId + "-L.jpg");
	               
	                    libros.add(libro);
	                }
	            }

	        }

	        return libros.stream().limit(25).toList();

	    } catch(Exception e){
	        e.printStackTrace();
	        return new ArrayList<>();
	    }
	}
}
