package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CrearForoDTO;
import com.example.demo.Model.ForoListaDTO;
import com.example.demo.Services.ForoService;

@RestController
@RequestMapping("api/foro")
public class ForoController {
	
	@Autowired
    private ForoService foroService;

    // CREAR FORO
    @PostMapping
    public ResponseEntity<String> crearForo(@RequestBody CrearForoDTO dto, @RequestParam Long idUser){
        foroService.crearForo(dto, idUser);

        return ResponseEntity.ok("Foro creado correctamente");
    }

    // LISTAR FOROS
    @GetMapping
    public ResponseEntity<List<ForoListaDTO>> listaForos(@RequestParam Long idUser){
        return ResponseEntity.ok(foroService.listaForos(idUser));
    }

    // BUSCAR FOROS
    @GetMapping("/buscar")
    public ResponseEntity<List<ForoListaDTO>> buscarForos(@RequestParam String nombre, @RequestParam Long idUser){
        return ResponseEntity.ok(foroService.buscarForo(nombre, idUser));
    }

    // SEGUIR / DEJAR DE SEGUIR
    @PostMapping("/{idForo}/seguir")
    public ResponseEntity<String> seguirForo(@PathVariable Long idForo,@RequestParam Long idUser){
        foroService.seguirForo(idForo, idUser);

        return ResponseEntity.ok("Estado de seguimiento actualizado");
    }

    // FAVORITO / QUITAR FAVORITO
    @PostMapping("/{idForo}/favorito")
    public ResponseEntity<String> favoritoForo(@PathVariable Long idForo, @RequestParam Long idUser){
        foroService.foroFavorito(idForo, idUser);

        return ResponseEntity.ok("Estado de favorito actualizado");
    }

}
