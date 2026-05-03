package com.example.demo.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	Optional<UserEntity> findByIdUser(Long idUser);

    //Optional<UserEntity> findByUser(String user);
    
    Optional<UserEntity> findByUserAndContrasena(String user, String contrasena);

    boolean existsByUser(String user);
    
    void deleteByUser(String user);

}
