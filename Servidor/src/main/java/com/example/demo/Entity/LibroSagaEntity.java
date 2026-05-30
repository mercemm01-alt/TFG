package com.example.demo.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIBRO_SAGA")
public class LibroSagaEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LS")
    private Long idLs;

    @ManyToOne
    @JoinColumn(name = "LIBRO_ID", nullable = false)
    private LibroEntity libro;

    @ManyToOne
    @JoinColumn(name = "SAGA_ID", nullable = false)
    private SagaEntity saga;

    @Column(name = "NUMERO_ORDEN")
    private Integer numeroOrden;

	public Long getIdLs() {
		return idLs;
	}

	public void setIdLs(Long idLs) {
		this.idLs = idLs;
	}

	public LibroEntity getLibro() {
		return libro;
	}

	public void setLibro(LibroEntity libro) {
		this.libro = libro;
	}

	public SagaEntity getSaga() {
		return saga;
	}

	public void setSaga(SagaEntity saga) {
		this.saga = saga;
	}

	public Integer getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(Integer numeroOrden) {
		this.numeroOrden = numeroOrden;
	}

	@Override
	public String toString() {
		return "LibroSagaEntity [idLs=" + idLs + ", libro=" + libro + ", saga=" + saga + ", numeroOrden=" + numeroOrden
				+ "]";
	}
    
    

}
