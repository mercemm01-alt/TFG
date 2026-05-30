package com.example.demo.Services.Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Estado;
import com.example.demo.Entity.UserLibroEntity;
import com.example.demo.Mapper.UserMapper;
import com.example.demo.Model.LibroDTO;
import com.example.demo.Repository.LibroRepository;
import com.example.demo.Repository.MisLibrosRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Services.MisLibrosService;

@Service
public class MisLibrosImplement implements MisLibrosService{
	
	@Autowired
    private MisLibrosRepository userLibroRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LibroRepository libroRepository;
    
    @Autowired
    private UserMapper mapper;

    @Override
    public void actualizarEstado(Long idUser, Long idLibro, String estado){

        Optional<UserLibroEntity> existe = userLibroRepository.findByUsuarioLibroIdUserAndLibroUserIdLibro(idUser, idLibro);

        UserLibroEntity ul;

        if(existe.isPresent()){
        	
            ul = existe.get();
            
        }else{
            ul = new UserLibroEntity();

            ul.setUsuarioLibro(userRepository.findById(idUser).orElseThrow());
            ul.setLibroUser(libroRepository.findById(idLibro).orElseThrow());
        }

        ul.setEstado(Estado.valueOf(estado));

        userLibroRepository.save(ul);
    }

	@Override
	public List<LibroDTO> obtenerMisLibros(Long idUser) {
		
		List<UserLibroEntity> libros = userLibroRepository.findByUsuarioLibroIdUser(idUser);

	    List<LibroDTO> resultado =new ArrayList<>();

	    for(UserLibroEntity ul : libros){

	        resultado.add(mapper.libroToDTO(ul.getLibroUser()));
	    }

	    return resultado;
	}

	@Override
	public String obtenerEstado(Long idUser, Long idLibro) {

	    Optional<UserLibroEntity> ul =
	        userLibroRepository
	        .findByUsuarioLibroIdUserAndLibroUserIdLibro(
	                idUser,
	                idLibro);

	    if (ul.isPresent()) {
	        return ul.get().getEstado().name();
	    }

	    return "";
	}

}
