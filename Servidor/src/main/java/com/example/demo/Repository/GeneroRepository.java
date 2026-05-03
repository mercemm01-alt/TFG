package com.example.demo.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.GeneroEntity;

public interface GeneroRepository extends JpaRepository<GeneroEntity, Long>{
	
	Optional<GeneroEntity> findByNombre(String nombre);

}
