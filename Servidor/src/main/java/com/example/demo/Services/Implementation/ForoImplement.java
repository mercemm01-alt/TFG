package com.example.demo.Services.Implementation;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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
	public Long crearForo(CrearForoDTO dto, MultipartFile imagen, Long idUser) {
		
		UserEntity usuario = userRepository.findById(idUser).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
		
		ForoEntity foro = new ForoEntity();
		
		foro.setNombre(dto.getNombre());
		foro.setDescripcion(dto.getDescripcion());
		
		if (imagen != null && !imagen.isEmpty()) {

	        try {
	            String nombreImagen = imagen.getOriginalFilename();

	            Path ruta = Paths.get("uploads", "img").resolve(nombreImagen);

	            Files.createDirectories(ruta.getParent());
	            Files.copy(imagen.getInputStream(), ruta, StandardCopyOption.REPLACE_EXISTING);

	            foro.setImg(nombreImagen);

	        } catch (IOException e) {
	            throw new RuntimeException("Error al guardar la imagen");
	        }

	    }
		foro.setFechaCreacion(LocalDateTime.now());
		foro.setCreador(usuario);
		
		foroRepository.save(foro);
		
		return foro.getIdForo();
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
	
	@Override
	public void eliminarForo(Long idForo, Long idUser) {

	    ForoEntity foro = foroRepository.findById(idForo).orElseThrow(() -> new RuntimeException("Foro no encontrado"));

	    if (!foro.getCreador().getIdUser().equals(idUser)) {
	        throw new RuntimeException("No tienes permisos para eliminar este foro");
	    }

	    foroRepository.delete(foro);
	}
	
	@Override
	public ForoListaDTO obtenerForo(Long idForo, Long idUser) {

	    ForoEntity foro = foroRepository.findById(idForo).orElseThrow(() -> new RuntimeException("Foro no encontrado"));

	    return convertirDTO(foro, idUser);
	}
	
	@Override
	public void editarForo(Long idForo, CrearForoDTO dto, MultipartFile imagen, Long idUser) {

	    ForoEntity foro = foroRepository.findById(idForo).orElseThrow(() -> new RuntimeException("Foro no encontrado"));

	    if (!foro.getCreador().getIdUser().equals(idUser)) {

	        throw new RuntimeException("No tienes permisos para editar este foro");
	    }

	    foro.setNombre(dto.getNombre());
	    foro.setDescripcion(dto.getDescripcion());

	    if (imagen != null && !imagen.isEmpty()) {
	        try {

	            String nombreImagen = System.currentTimeMillis() + "_" + imagen.getOriginalFilename();
	            Path ruta = Paths.get("img").resolve(nombreImagen);

	            Files.createDirectories(ruta.getParent());
	            Files.copy(imagen.getInputStream(), ruta, StandardCopyOption.REPLACE_EXISTING);

	            foro.setImg(nombreImagen);

	        } catch (IOException e) {
	            throw new RuntimeException("Error al guardar la imagen");
	        }
	    }

	    foroRepository.save(foro);
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
