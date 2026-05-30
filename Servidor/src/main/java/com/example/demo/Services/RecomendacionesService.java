package com.example.demo.Services;

import java.util.List;

import com.example.demo.Model.LibroDTO;

public interface RecomendacionesService {
	
	List<LibroDTO> obtenerRecomendaciones(Long idUser);

}
