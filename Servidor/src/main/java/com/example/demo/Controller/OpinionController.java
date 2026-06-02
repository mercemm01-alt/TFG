package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.OpinionDTO;
import com.example.demo.Services.OpinionService;

@RestController
@RequestMapping("/api/opiniones")
public class OpinionController {
	
	@Autowired
	private OpinionService opinionService;

	@PostMapping("/{idLibro}")
	public ResponseEntity<Void> guardarOpinion(@PathVariable Long idLibro,  @RequestBody OpinionDTO dto){

	    opinionService.guardarOpinion(idLibro,dto);

	    return ResponseEntity.ok().build();
	    
	}
	
	@GetMapping("/{idLibro}")
	public OpinionDTO obtenerOpinion(@PathVariable Long idLibro, @RequestParam Long idUser){

	    return opinionService.obtenerOpinion(idLibro, idUser);
	}
}
