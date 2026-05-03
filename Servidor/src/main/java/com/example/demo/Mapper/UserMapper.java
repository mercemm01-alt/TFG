package com.example.demo.Mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Model.InterfaceUserDTO;

@Component
public class UserMapper {
	
	public InterfaceUserDTO toDTO(UserEntity user) {

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
}
