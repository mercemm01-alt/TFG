package com.example.demo.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.LibroEntity;
import com.example.demo.Model.LibroDTO;
import com.example.demo.Repository.LibroRepository;
import com.example.demo.Services.LibroService;

@Service
public class LibroImplement implements LibroService{
	
	@Autowired
	private LibroRepository libroRepository;

	@Override
	public LibroDTO obtenerLibroPorId(Long id) {
		
		LibroEntity libro = libroRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Libro no encontrado"));

	    LibroDTO dto = new LibroDTO();

	    dto.setIdLibro(libro.getIdLibro());
	    dto.setTitulo(libro.getTitulo());
	    dto.setAutor(libro.getAutor());
	    dto.setEditorial(libro.getEditorial());
	    dto.setNumPaginas(libro.getNumPaginas());
	    dto.setSinopsis(libro.getSinopsis());
	    dto.setImagen(libro.getImagen());
	    dto.setFechaPublicacion(libro.getFechaPublicacion());
	    dto.setValoracion(libro.getValoracion());

	    return dto;
	}
	
}
