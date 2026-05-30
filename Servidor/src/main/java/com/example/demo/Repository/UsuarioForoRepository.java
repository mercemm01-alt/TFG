package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.UserForoEntity;

@Repository
public interface UsuarioForoRepository extends JpaRepository<UserForoEntity, Long>{

	Optional<UserForoEntity>  findByUsuarioIdUserAndForoIdForo(Long iduser, Long idForo);
}
