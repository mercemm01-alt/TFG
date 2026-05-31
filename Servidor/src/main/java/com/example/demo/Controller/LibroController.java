package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LibroDTO;
import com.example.demo.Services.LibroService;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/{id}")
    public LibroDTO obtenerLibro(@PathVariable Long id) {

        return libroService.obtenerLibroPorId(id);

    }
    
    @GetMapping("/sugerencias")
    public List<LibroDTO> sugerencias(@RequestParam String titulo){

        return libroService.buscarLibros(titulo);
    }
}