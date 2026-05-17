package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ApiLibrosDTO;
import com.example.demo.Services.GeneroService;
import com.example.demo.Services.ApiLibrosService;

@RestController
@RequestMapping("/api/libros")
public class ApiLibrosController {
	
	@Autowired
    private ApiLibrosService apiLibrosService;
	
	@Autowired
    private GeneroService generoService;

    @GetMapping("/{nombre}")
    public ResponseEntity<List<ApiLibrosDTO>> buscarLibros(@PathVariable  String nombre) {

        return ResponseEntity.ok(apiLibrosService.buscarLibros(nombre));
    }
    
    @GetMapping("/generos")
    public ResponseEntity<List<String>> obtenerGeneros() {

        return ResponseEntity.ok( generoService.obtenerGeneros()
        );
    }
}
