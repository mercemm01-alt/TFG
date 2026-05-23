package com.example.demo.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.ForoEntity;

public interface ForoRepository extends JpaRepository<ForoEntity, Long>{
	
	List<ForoEntity> findByNombreContainingIgnoreCase(String nombre);
 
}
