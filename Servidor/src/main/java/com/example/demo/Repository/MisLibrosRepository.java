package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.UserLibroEntity;

@Repository
public interface MisLibrosRepository extends JpaRepository<UserLibroEntity,Long>{
	
	 Optional<UserLibroEntity>findByUsuarioLibroIdUserAndLibroUserIdLibro(Long idUser, Long idLibro);

	    List<UserLibroEntity>findByUsuarioLibroIdUser(Long idUser);
}
