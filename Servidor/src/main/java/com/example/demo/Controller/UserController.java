package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LoginDTO;
import com.example.demo.Model.RegistroDTO;
import com.example.demo.Services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
    private UserService usuarioService;

    @PostMapping("/registro")
    public RegistroDTO registro(@RequestBody RegistroDTO dtoRegistro) {
    	return usuarioService.registrarUsuario(dtoRegistro);
    }
    
    @PostMapping("/login")
    public LoginDTO login(@RequestBody LoginDTO dtoLogin) {
    	return usuarioService.login(dtoLogin);
    }
}
