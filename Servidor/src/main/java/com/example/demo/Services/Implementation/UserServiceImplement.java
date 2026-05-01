package com.example.demo.Services.Implementation;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Model.LoginDTO;
import com.example.demo.Model.RegistroDTO;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Services.UserService;

@Service
public class UserServiceImplement implements UserService {
	
	 @Autowired
	    private UserRepository usuarioRepository;
	 

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
		

}
