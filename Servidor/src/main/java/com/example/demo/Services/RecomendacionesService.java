package com.example.demo.Services;

import java.util.List;

import com.example.demo.Model.ApiLibrosDTO;

public interface RecomendacionesService {

	List<ApiLibrosDTO> obtenerRecomendaciones(Long idUser);
	
}
