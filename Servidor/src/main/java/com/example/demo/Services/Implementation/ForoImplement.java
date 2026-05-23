package com.example.demo.Services.Implementation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.ForoEntity;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Entity.UserForoEntity;
import com.example.demo.Model.CrearForoDTO;
import com.example.demo.Model.ForoListaDTO;
import com.example.demo.Repository.ForoRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Repository.UsuarioForoRepository;
import com.example.demo.Services.ForoService;

@Service
public class ForoImplement implements ForoService{

	 @Autowired
	 private ForoRepository foroRepository;

	 @Autowired
	 private UserRepository userRepository;

	 @Autowired
	 private UsuarioForoRepository usuarioForoRepository;

	    
	@Override
	public void crearForo(CrearForoDTO dto, Long idUser) {
		UserEntity usuario = userRepository.findById(idUser).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
		
		ForoEntity foro = new ForoEntity();
		
		foro.setNombre(dto.getNombre());
		foro.setDescripcion(dto.getDescripcion());
		foro.setImg(dto.getImage());
		foro.setFechaCreacion(LocalDateTime.now());
		foro.setCreador(usuario);
		
		foroRepository.save(foro);
	}

	@Override
	public List<ForoListaDTO> listaForos(Long idUser) {
		
		List<ForoEntity> foros = foroRepository.findAll();
		
		List<ForoListaDTO> respuesta = new ArrayList<>();
		
		for(ForoEntity foro : foros) {	
			respuesta.add(convertirDTO(foro, idUser));
		}
		return respuesta;
	}

	@Override
	public List<ForoListaDTO> buscarForo(String nombre, Long idUser) {

		List<ForoEntity> foros = foroRepository.findByNombreContainingIgnoreCase(nombre);
		
		List<ForoListaDTO> respuesta = new ArrayList<>();
		
		for(ForoEntity foro : foros) {
			respuesta.add(convertirDTO(foro, idUser));
		}
		return respuesta;
	}

	@Override
	public void seguirForo(Long idForo, Long idUser) {
		Optional<UserForoEntity> relacion = usuarioForoRepository.findByUsuarioIdUserAndForoIdForo(idUser, idForo);
		
		if(relacion.isPresent()) {
			UserForoEntity uf = relacion.get();
			
			uf.setSiguiendo(!uf.getSiguiendo());
			
			usuarioForoRepository.save(uf);
		}else {
			UserEntity usuario = userRepository.findById(idUser).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
			
			ForoEntity foro = foroRepository.findById(idForo).orElseThrow(() -> new RuntimeException("Foro no encontrado"));
			
			UserForoEntity uf = new UserForoEntity();
			
			uf.setUsuario(usuario);
			uf.setForo(foro);
			uf.setSiguiendo(true);
			uf.setFavorito(false);
			
			usuarioForoRepository.save(uf);
		}
		
	}

	@Override
	public void foroFavorito(Long idForo, Long idUser) {
		Optional<UserForoEntity> relacion = usuarioForoRepository.findByUsuarioIdUserAndForoIdForo(idUser, idForo);
		
		if(relacion.isPresent()) {
			UserForoEntity uf = relacion.get();
			
			uf.setFavorito(!uf.getFavorito());
			
			usuarioForoRepository.save(uf);
		}else {
			UserEntity usuario = userRepository.findById(idUser).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
			
			ForoEntity foro = foroRepository.findById(idForo).orElseThrow(() -> new RuntimeException("Foro no encontrado"));
			
			UserForoEntity uf = new UserForoEntity();
			
			uf.setUsuario(usuario);
			uf.setForo(foro);
			uf.setSiguiendo(false);
			uf.setFavorito(true);
			
			usuarioForoRepository.save(uf);
		}
		
	}
	
	private ForoListaDTO convertirDTO(ForoEntity foro, Long idUser) {
		 ForoListaDTO dto = new ForoListaDTO();

		 dto.setIdForos(foro.getIdForo());
		 dto.setNombre(foro.getNombre());
		 dto.setDescripcion(foro.getDescripcion());
		 dto.setImg(foro.getImg());

		 dto.setEsMio(foro.getCreador().getIdUser().equals(idUser));

		 Optional<UserForoEntity> relacion = usuarioForoRepository.findByUsuarioIdUserAndForoIdForo(idUser, foro.getIdForo());

		 if(relacion.isPresent()) {
			 dto.setSiguiendo(relacion.get().getSiguiendo());
			 dto.setFavorito(relacion.get().getFavorito());
		 } else {
			 dto.setSiguiendo(false);
			 dto.setFavorito(false);
		 }
		 return dto;
	}
	
}
