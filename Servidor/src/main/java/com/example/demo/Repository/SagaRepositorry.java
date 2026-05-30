package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.SagaEntity;

@Repository
public interface SagaRepositorry  extends JpaRepository<SagaEntity, Long> {
	
	Optional<SagaEntity> findByNombre(String nombre);

}
