package com.example.demo.Services;

import java.util.List;

import com.example.demo.Model.LibroDTO;

public interface LibroService {
	
	LibroDTO obtenerLibroPorId(Long id);
	
	List<LibroDTO> buscarLibros(String titulo);
}
