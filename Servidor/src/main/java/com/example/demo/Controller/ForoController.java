package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Model.CrearForoDTO;
import com.example.demo.Model.ForoListaDTO;
import com.example.demo.Services.ForoService;

import tools.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("api/foro")
public class ForoController {
	
	@Autowired
    private ForoService foroService;
	
	@Autowired
	private ObjectMapper objectMapper;

    // CREAR FORO
	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public ResponseEntity<String> crearForo(@RequestPart("foroJson") String foroJson, @RequestPart(value = "imagen",required = false)
		        MultipartFile imagen, @RequestParam Long idUser) throws Exception {

		    CrearForoDTO dto = objectMapper.readValue(foroJson, CrearForoDTO.class);

		    foroService.crearForo( dto, imagen, idUser);

		    return ResponseEntity.ok( "Foro creado correctamente");
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
    
    @DeleteMapping("/{idForo}")
    public ResponseEntity<Map<String, String>> eliminarForo(@PathVariable Long idForo, @RequestParam Long idUser) {

        foroService.eliminarForo(idForo,idUser);

        return ResponseEntity.ok( Map.of("mensaje", "Foro eliminado correctamente"));
    }
    @PutMapping(value = "/{idForo}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    	public ResponseEntity<String> editarForo(@PathVariable Long idForo, @RequestPart("foroJson") String foroJson, @RequestPart(value = "imagen", required = false)
    	        MultipartFile imagen, @RequestParam Long idUser) throws Exception {

    	    CrearForoDTO dto = objectMapper.readValue(foroJson, CrearForoDTO.class);

    	    foroService.editarForo(idForo, dto, imagen, idUser);

    	    return ResponseEntity.ok( "Foro actualizado");
    	}
    
    @GetMapping("/{idForo}")
    public ResponseEntity<ForoListaDTO> obtenerForo(@PathVariable Long idForo, @RequestParam Long idUser) {

        return ResponseEntity.ok(foroService.obtenerForo(idForo, idUser));
    }

}
