package com.example.demo.Services;

import java.util.List;

import com.example.demo.Model.CrearForoDTO;
import com.example.demo.Model.ForoListaDTO;

public interface ForoService {
	
	void crearForo(CrearForoDTO dto, Long idUser);
	
	List<ForoListaDTO> listaForos(Long idUser);
	
	List<ForoListaDTO> buscarForo(String nombre, Long idUser);
	
	void seguirForo(Long idForo, Long  idUser);
	
	void foroFavorito(Long idForo, Long idUser);
}
