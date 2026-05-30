package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.GeneroEntity;
import com.example.demo.Repository.GeneroRepository;

@RestController
@RequestMapping("/api/libros/generos")
public class GeneroController {

    @Autowired
    private GeneroRepository generoRepository;

    @GetMapping
    public  List<String> obtenerGeneros() {

    	return generoRepository.findAll()
                .stream()
                .map(GeneroEntity::getNombre)
                .toList();

    }

}
