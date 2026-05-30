package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.LibroEntity;
import com.example.demo.Entity.LibroSagaEntity;

@Repository
public interface LibroRepository extends JpaRepository<LibroEntity,Long>{

		Optional<LibroEntity>findByApiId(String apiId);

		boolean existsByApiId(String apiId);

		@Query(""" 
				SELECT ls FROM LibroSagaEntity ls WHERE ls.libro.idLibro = :idLibro 
				""")
		
			List<LibroSagaEntity> obtenerSagasLibro(Long idLibro);
}
