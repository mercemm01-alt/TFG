package com.example.demo.Services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Model.CrearForoDTO;
import com.example.demo.Model.ForoListaDTO;

public interface ForoService {
	
	Long crearForo(CrearForoDTO dto, MultipartFile imagen, Long idUser);
	
	List<ForoListaDTO> listaForos(Long idUser);
	
	List<ForoListaDTO> buscarForo(String nombre, Long idUser);
	
	void seguirForo(Long idForo, Long  idUser);
	
	void foroFavorito(Long idForo, Long idUser);
	
	void eliminarForo(Long idForo, Long idUser);
	
	ForoListaDTO obtenerForo(Long idForo, Long idUser);
	
	void editarForo(Long idForo, CrearForoDTO dto, MultipartFile imagen, Long idUser);

}
