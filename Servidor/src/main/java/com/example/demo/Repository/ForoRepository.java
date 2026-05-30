package com.example.demo.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ForoEntity;

@Repository
public interface ForoRepository extends JpaRepository<ForoEntity, Long>{
	
	List<ForoEntity> findByNombreContainingIgnoreCase(String nombre);
 
}
