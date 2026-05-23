package com.example.demo.Services;

import java.util.List;

import com.example.demo.Model.CrearMensajeDTO;
import com.example.demo.Model.MensajeForoDTO;

public interface MensajeForoService {
	
	MensajeForoDTO enviarMensaje(CrearMensajeDTO dto, Long idUser);
	
	List<MensajeForoDTO> listaMensajes(Long idForo, Long idUser);
}
