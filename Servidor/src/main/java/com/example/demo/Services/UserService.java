package com.example.demo.Services;

import com.example.demo.Model.InterfaceUserDTO;
import com.example.demo.Model.LoginDTO;
import com.example.demo.Model.RegistroDTO;

public interface UserService {
	
	RegistroDTO registrarUsuario(RegistroDTO dtoRegistro);
	
	LoginDTO login(LoginDTO dtoLogin);
	
	InterfaceUserDTO obtenerUser(Long id);
	
	InterfaceUserDTO actualizarPerfil(InterfaceUserDTO dtoActualizarPerfil);
}
