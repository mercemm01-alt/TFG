package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.LibroGeneroEntity;

@Repository
public interface LibroGeneroRepository extends JpaRepository<LibroGeneroEntity,Long>{

}
