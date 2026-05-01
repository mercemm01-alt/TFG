package com.example.demo.Services;

import com.example.demo.Model.LoginDTO;
import com.example.demo.Model.RegistroDTO;

public interface UserService {

	RegistroDTO registrarUsuario(RegistroDTO dtoRegistro);
	
	LoginDTO login(LoginDTO dtoLogin);
    
}
