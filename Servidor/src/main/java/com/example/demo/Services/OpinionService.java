package com.example.demo.Services;

import com.example.demo.Model.OpinionDTO;

public interface OpinionService {

	void guardarOpinion(Long idLibro, OpinionDTO dto);

	OpinionDTO obtenerOpinion(Long idLibro, Long idUser);
}
