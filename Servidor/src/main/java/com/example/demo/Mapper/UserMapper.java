package com.example.demo.Mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.LibroEntity;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Model.InterfaceUserDTO;
import com.example.demo.Model.LibroDTO;

@Component
public class UserMapper {
	
	public InterfaceUserDTO userToDTO(UserEntity user) {

        List<String> generos = user.getUserGeneros()
                .stream()
                .map(ug -> ug.getGenero().getNombre())
                .collect(Collectors.toList());

        return new InterfaceUserDTO(
                user.getIdUser(),
                user.getUser(),
                null,
                user.getImagenUser(),
                user.getDescripcion(),
                generos
        );
    }
	
	public LibroDTO libroToDTO(LibroEntity libro) {

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
        dto.setGeneros(libro.getGenerosLibro().stream().map(lg -> lg.getGenero().getNombre()).toList());

        return dto;
    }
}
