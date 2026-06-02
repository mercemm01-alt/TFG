package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Model.InterfaceUserDTO;
import com.example.demo.Model.LoginDTO;
import com.example.demo.Model.RegistroDTO;
import com.example.demo.Services.UserService;

import tools.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private ObjectMapper objectMapper;
	
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
    
    @GetMapping("/verPerfil/{id}")
    public ResponseEntity<InterfaceUserDTO> obtenerUsuario(@PathVariable Long id) {

        InterfaceUserDTO usuario = usuarioService.obtenerUser(id);

        return ResponseEntity.ok(usuario);
    }
    
    @PutMapping(value = "/editarPerfil/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<InterfaceUserDTO> actualizarPerfil(@PathVariable Long id, @RequestPart("userJson") String userJson, 
    		@RequestPart(value = "imagen", required = false)MultipartFile imagen) throws Exception {

        InterfaceUserDTO dtoActualizarPerfil = objectMapper.readValue(userJson, InterfaceUserDTO.class);

        dtoActualizarPerfil.setIdUser(id);

        InterfaceUserDTO usuarioActualizado = usuarioService.actualizarPerfil(dtoActualizarPerfil, imagen);

        return ResponseEntity.ok(usuarioActualizado);
    }
}
