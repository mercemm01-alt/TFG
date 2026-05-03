package com.example.demo.Services.Implementation;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.GeneroEntity;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Entity.UserGeneroEntity;
import com.example.demo.Mapper.UserMapper;
import com.example.demo.Model.InterfaceUserDTO;
import com.example.demo.Model.LoginDTO;
import com.example.demo.Model.RegistroDTO;
import com.example.demo.Repository.GeneroRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Services.UserService;

@Service
public class UserServiceImplement implements UserService {
	
	@Autowired
		private GeneroRepository generoRepository;
	
	 @Autowired
	    private UserRepository usuarioRepository;
	 
	 @Autowired
	 private UserMapper userMapper;
	 
	    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$";

	@Override
	public RegistroDTO registrarUsuario(RegistroDTO dtoRegistro) {
		
		// 1. Usuario duplicado
        if (usuarioRepository.existsByUser(dtoRegistro.getUser())) {
            throw new RuntimeException("usuario ya registrado");
        }

        // 2. Validar contraseña
        if (!Pattern.matches(PASSWORD_REGEX, dtoRegistro.getContrasena())) {
            throw new RuntimeException("la contraseña debe tener mínimo 8 caracteres, un número y un carácter especial");
        }
        
        UserEntity nuevoUsuario = new UserEntity();
        nuevoUsuario.setUser(dtoRegistro.getUser());
        nuevoUsuario.setCorreo(dtoRegistro.getCorreo());
        nuevoUsuario.setContrasena(dtoRegistro.getContrasena());
        nuevoUsuario.setFechaNacimiento(dtoRegistro.getFechaNacimiento());
        
        usuarioRepository.save(nuevoUsuario);
        
        return new RegistroDTO(
        		nuevoUsuario.getIdUser(),
        		nuevoUsuario.getUser(),
        		nuevoUsuario.getCorreo(),
        		nuevoUsuario.getFechaNacimiento());
        		
    }

	@Override
	public LoginDTO login(LoginDTO dtoLogin) {
		
		UserEntity user = usuarioRepository
				.findByUserAndContrasena(
					dtoLogin.getUser(),
					dtoLogin.getContrasena()
					)
				.orElse(null);
		
		if(user == null) {
			return null;
		}
		
		return new LoginDTO(
				user.getIdUser(),
				user.getUser());
	}
	
	@Override
	public InterfaceUserDTO obtenerUser(Long id) {

	    UserEntity user = usuarioRepository.findByIdUser(id)
	            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

	    return userMapper.toDTO(user);
	}

	@Override
	public InterfaceUserDTO actualizarPerfil(InterfaceUserDTO dtoActualizarPerfil) {
		
		UserEntity userUpdate = usuarioRepository.findByIdUser(dtoActualizarPerfil.getIdUser())
				.orElseThrow(()-> new RuntimeException("Usuario no encontrado"));
		
		// Nombre
		if(!dtoActualizarPerfil.getUser().equals(userUpdate.getUser())) {
			userUpdate.setUser(dtoActualizarPerfil.getUser());
		}
		
		// Contraseña
		if(!dtoActualizarPerfil.getContrasena().equals(userUpdate.getContrasena())) {
			userUpdate.setContrasena(dtoActualizarPerfil.getContrasena());
		}
		
		//Imagen
		if(!dtoActualizarPerfil.getImagen().equals(userUpdate.getImagenUser())) {
			userUpdate.setImagenUser(dtoActualizarPerfil.getImagen());
		}
		
		// Descripcion
		if(!dtoActualizarPerfil.getDescripcion().equals(userUpdate.getDescripcion())) {
			userUpdate.setDescripcion(dtoActualizarPerfil.getDescripcion());
		}
		
		 //Generos 
		Set<String> generosActuales = userUpdate.getUserGeneros()
				.stream()
				.map(ug -> ug.getGenero().getNombre())
				.collect(Collectors.toSet());
		
		Set<String> generosDTO = new HashSet<>(dtoActualizarPerfil.getGeneros());
		
		//Comparar
		Set<String> aEliminar = new HashSet<>(generosActuales);
		aEliminar.removeAll(generosDTO);
		
		Set<String> aAñadir = new HashSet<>(generosDTO);
		aAñadir.removeAll(generosActuales);
		
		userUpdate.getUserGeneros().removeIf(ug -> aEliminar.contains(ug.getGenero().getNombre()));
		
		for(String generoNom : aAñadir) {
			
			GeneroEntity genero = generoRepository.findByNombre(generoNom).orElseThrow(() -> new RuntimeException("Genero no encontrado"));
			
			UserGeneroEntity nuevo = new UserGeneroEntity();
			nuevo.setUsuario(userUpdate); //  Hacer formulario y probar y hacer pagnina principal mas meter header a todo
			nuevo.setGenero(genero);
			
			userUpdate.getUserGeneros().add(nuevo);
		}

		return userMapper.toDTO(userUpdate);
	}

	
	
	
	
	
	
	
	
}
