package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.LibroEntity;

public interface LibroRepository 
	extends JpaRepository<LibroEntity,Long>{

		Optional<LibroEntity>
		findByApiId(String apiId);

		boolean existsByApiId(
		String apiId
		);

}
