package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.LibroSagaEntity;

@Repository
public interface LibroSagaRepository extends JpaRepository<LibroSagaEntity, Long>{
	
	List<LibroSagaEntity> findBySagaIdSagaOrderByNumeroOrdenAsc(Long idSaga);

    List<LibroSagaEntity> findByLibroIdLibro(Long idLibro);

    boolean existsByLibroIdLibroAndSagaIdSaga(Long idLibro, Long idSaga);

}
