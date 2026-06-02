package com.example.demo.Services;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Model.InterfaceUserDTO;
import com.example.demo.Model.LoginDTO;
import com.example.demo.Model.RegistroDTO;

public interface UserService {
	
	RegistroDTO registrarUsuario(RegistroDTO dtoRegistro);
	
	LoginDTO login(LoginDTO dtoLogin);
	
	InterfaceUserDTO obtenerUser(Long id);
	
	InterfaceUserDTO actualizarPerfil(InterfaceUserDTO dtoActualizarPerfil, MultipartFile imagen) throws Exception;
	
	void eliminarUsuario(Long id);
}
