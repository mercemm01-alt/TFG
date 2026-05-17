package com.example.demo.Services.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.GeneroEntity;
import com.example.demo.Repository.GeneroRepository;
import com.example.demo.Services.GeneroService;

@Service
public class GeneroImplement implements GeneroService{
	
	@Autowired
    private GeneroRepository generoRepository;

	@Override
	public List<String> obtenerGeneros() {
		
		 return generoRepository.findAll()
		            .stream()
		            .map(GeneroEntity::getNombre)
		            .toList();
	}

}
