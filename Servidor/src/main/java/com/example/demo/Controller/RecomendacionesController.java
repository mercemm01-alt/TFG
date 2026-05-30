package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LibroDTO;
import com.example.demo.Services.RecomendacionesService;

@RestController
@RequestMapping("/api/recomendaciones")
public class RecomendacionesController {
	
	@Autowired
    private RecomendacionesService recomendacionesService;

    @GetMapping("/{idUser}")
    public ResponseEntity<List<LibroDTO>> obtenerRecomendaciones(@PathVariable Long idUser) {

        return ResponseEntity.ok(recomendacionesService.obtenerRecomendaciones(idUser));
    }
}
