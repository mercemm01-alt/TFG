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

import com.example.demo.Model.CrearMensajeDTO;
import com.example.demo.Model.MensajeForoDTO;
import com.example.demo.Services.MensajeForoService;

@RestController
@RequestMapping("api/mensaje-foro")
public class MensajeForoController {

	@Autowired
    private MensajeForoService mensajeForoService;

    // ENVIAR MENSAJE
    @PostMapping
    public ResponseEntity<MensajeForoDTO> enviarMensaje(@RequestBody CrearMensajeDTO dto, @RequestParam Long idUser){
        MensajeForoDTO mensajeCreado = mensajeForoService.enviarMensaje(dto, idUser);

        return ResponseEntity.ok(mensajeCreado);
    }

    // LISTAR MENSAJES
    @GetMapping("/{idForo}")
    public ResponseEntity<List<MensajeForoDTO>> listarMensajes(@PathVariable Long idForo,@RequestParam Long idUser){

        return ResponseEntity.ok(mensajeForoService.listaMensajes(idForo, idUser));
    }
}
