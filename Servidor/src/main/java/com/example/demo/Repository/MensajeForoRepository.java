package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.MensajeForoEntity;


public interface MensajeForoRepository extends JpaRepository<MensajeForoEntity, Long>{

	List<MensajeForoEntity> findByForoMensajeIdForoOrderByFechaAsc(Long idForo);
}
