package com.example.demo.Services.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.LibroEntity;
import com.example.demo.Mapper.UserMapper;
import com.example.demo.Model.LibroDTO;
import com.example.demo.Repository.LibroRepository;
import com.example.demo.Services.LibroService;

@Service
public class LibroImplement implements LibroService{
	
	@Autowired
	private LibroRepository libroRepository;
	
	@Autowired
	 private UserMapper mapper;

	@Override
	public LibroDTO obtenerLibroPorId(Long id) {

	    LibroEntity libro = libroRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Libro no encontrado"));

	    return mapper.libroToDTO(libro);
	}

	@Override
	public List<LibroDTO> buscarLibros(String titulo) {

	    return libroRepository
	            .findTop5ByTituloContainingIgnoreCase(titulo)
	            .stream()
	            .map(mapper::libroToDTO)
	            .toList();
	}
	
}
