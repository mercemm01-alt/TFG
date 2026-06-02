package com.example.demo.Services.Implementation;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.OpinionEntity;
import com.example.demo.Model.OpinionDTO;
import com.example.demo.Repository.LibroRepository;
import com.example.demo.Repository.OpinionRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Services.OpinionService;

@Service
public class OpinionImplement implements OpinionService{
	
	@Autowired 
	private OpinionRepository opinionRepository;
	
	@Autowired 
	private UserRepository userRepository;
	
	@Autowired 
	private LibroRepository libroRepository;

	@Override
	public void guardarOpinion(Long idLibro, OpinionDTO dto) {
		
		 Optional<OpinionEntity> opinion = opinionRepository.findByUsuarioOpinionIdUserAndLibroOpinioIdLibro(dto.getIdUser(),idLibro);

		    if(opinion.isPresent()) {

		        OpinionEntity existente =opinion.get();

		        existente.setComentario(dto.getComentario());
		        existente.setValoracion(dto.getValoracion());
		        existente.setFechaComent(LocalDateTime.now());

		        opinionRepository.save(existente);

		    } else {

		        OpinionEntity nueva = new OpinionEntity();

		        nueva.setComentario(dto.getComentario());
		        nueva.setValoracion(dto.getValoracion());
		        nueva.setFechaComent(LocalDateTime.now());
		        nueva.setUsuarioOpinion(userRepository.findById(dto.getIdUser()).orElseThrow());
		        nueva.setLibroOpinio(libroRepository.findById(idLibro).orElseThrow());

		        opinionRepository.save(nueva);
		    }
		
	}

	@Override
	public OpinionDTO obtenerOpinion(Long idLibro, Long idUser) {
		
		 Optional<OpinionEntity> opinion = opinionRepository.findByUsuarioOpinionIdUserAndLibroOpinioIdLibro(idUser,idLibro);

		    if(opinion.isEmpty()){
		        return null;
		    }

		    OpinionDTO dto = new OpinionDTO();

		    dto.setComentario(opinion.get().getComentario());
		    dto.setValoracion(opinion.get().getValoracion());
		    dto.setFechaComent(opinion.get().getFechaComent());

		    return dto;
	}

}
