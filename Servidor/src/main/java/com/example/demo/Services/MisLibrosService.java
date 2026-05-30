package com.example.demo.Services;

import java.util.List;

import com.example.demo.Model.LibroDTO;

public interface MisLibrosService {
	
	void actualizarEstado(Long idUser, Long idLibro, String estado);
	
	String obtenerEstado(Long idUser, Long idLibro);
	
	List<LibroDTO>obtenerMisLibros(Long idUser);
}
