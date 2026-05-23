package com.example.demo.Services.Implementation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.ForoEntity;
import com.example.demo.Entity.MensajeForoEntity;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Model.CrearMensajeDTO;
import com.example.demo.Model.MensajeForoDTO;
import com.example.demo.Repository.ForoRepository;
import com.example.demo.Repository.MensajeForoRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Services.MensajeForoService;

@Service
public class MensajeForoImplement implements MensajeForoService{

	@Autowired
    private MensajeForoRepository mensajeForoRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ForoRepository foroRepository;

    
	@Override
	public MensajeForoDTO enviarMensaje(CrearMensajeDTO dto, Long idUser) {
		UserEntity usuario = userRepository.findById(idUser).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        ForoEntity foro = foroRepository.findById(dto.getIdForo()).orElseThrow(() -> new RuntimeException("Foro no encontrado"));

        MensajeForoEntity mensaje = new MensajeForoEntity();

        mensaje.setUsuarioMensaje(usuario);
        mensaje.setForoMensaje(foro);
        mensaje.setContenidoMsF(dto.getContenido());
        mensaje.setFecha(LocalDateTime.now());

        MensajeForoEntity mensajeGuardado = mensajeForoRepository.save(mensaje);

        // Convertir a DTO y devolverlo
        MensajeForoDTO respuesta = new MensajeForoDTO();
        respuesta.setIdMensaje(mensajeGuardado.getIdMensajeForo());
        respuesta.setUsername(mensajeGuardado.getUsuarioMensaje().getUser());
        respuesta.setContenido(mensajeGuardado.getContenidoMsF());
        respuesta.setFecha(mensajeGuardado.getFecha());
        respuesta.setEsMio(true);
        respuesta.setEsCreador(mensajeGuardado.getUsuarioMensaje().getIdUser() == foro.getCreador().getIdUser());

        return respuesta;
	}

	@Override
	public List<MensajeForoDTO> listaMensajes(Long idForo, Long idUser) {
		List<MensajeForoEntity> mensajes = mensajeForoRepository.findByForoMensajeIdForoOrderByFechaAsc(idForo);

        List<MensajeForoDTO> respuesta = new ArrayList<>();

        for(MensajeForoEntity mensaje : mensajes) {

            MensajeForoDTO dto = new MensajeForoDTO();

            dto.setIdMensaje(mensaje.getIdMensajeForo());
            dto.setUsername(mensaje.getUsuarioMensaje().getUser());
            dto.setContenido(mensaje.getContenidoMsF());
            dto.setFecha(mensaje.getFecha());
            dto.setEsMio(mensaje.getUsuarioMensaje().getIdUser() == idUser);
            dto.setEsCreador(mensaje.getUsuarioMensaje().getIdUser() == mensaje.getForoMensaje().getCreador().getIdUser());

            respuesta.add(dto);
        }

        return respuesta;

	}

}
