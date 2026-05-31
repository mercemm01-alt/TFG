package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LibroDTO;
import com.example.demo.Services.MisLibrosService;

@RestController
@RequestMapping("/api/mis-libros")
public class MisLibrosController {
	
	@Autowired
	private MisLibrosService misLibrosService;

	@PostMapping("/{idLibro}/estado")
	public void actualizarEstadoLibro(@PathVariable Long idLibro, @RequestParam Long idUser, @RequestParam String estado){
	
	    misLibrosService.actualizarEstado( idUser, idLibro, estado);
	   
	}
	
	@GetMapping("/{idLibro}/estado")
	public Map<String, String> obtenerEstadoLibro(@PathVariable Long idLibro,@RequestParam Long idUser){

		String estado = misLibrosService.obtenerEstado(idUser, idLibro);

	    return Map.of("estado", estado);
	}
	
	@GetMapping("/{idUser}")
	public List<LibroDTO>obtenerMisLibros(@PathVariable Long idUser){

	    return misLibrosService.obtenerMisLibros(idUser);
	}
	
	@GetMapping("/lectura-actual/{idUser}")
    public LibroDTO obtenerLecturaActual(@PathVariable Long idUser){

        return misLibrosService.obtenerLecturaActual(idUser);
    }
	
	@GetMapping("/ultimas-lecturas/{idUser}")
	public List<LibroDTO> obtenerUltimasLecturas(@PathVariable Long idUser){

	    return misLibrosService.obtenerUltimasLecturas(idUser);
	}
}
