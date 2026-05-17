package com.example.demo.Services;

import java.util.List;

import com.example.demo.Model.ApiLibrosDTO;

public interface ApiLibrosService {
	
	List<ApiLibrosDTO> buscarLibros(String nombre);
}
