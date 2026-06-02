package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.OpinionEntity;

@Repository
public interface OpinionRepository extends JpaRepository<OpinionEntity, Long>{

	Optional<OpinionEntity>findByUsuarioOpinionIdUserAndLibroOpinioIdLibro(Long idUser, Long idLibro);
}
