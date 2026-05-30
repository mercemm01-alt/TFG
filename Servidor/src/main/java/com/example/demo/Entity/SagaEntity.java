package com.example.demo.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "SAGA")
public class SagaEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SAGA")
    private Long idSaga;

    @Column(name = "NOMBRE", nullable = false, unique = true)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO", nullable = false)
    private TipoSaga tipo;

    @OneToMany(mappedBy = "saga")
    private List<LibroSagaEntity> librosSaga = new ArrayList<>();

	public Long getIdSaga() {
		return idSaga;
	}

	public void setIdSaga(Long idSaga) {
		this.idSaga = idSaga;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoSaga getTipo() {
		return tipo;
	}

	public void setTipo(TipoSaga tipo) {
		this.tipo = tipo;
	}

	public List<LibroSagaEntity> getLibrosSaga() {
		return librosSaga;
	}

	public void setLibrosSaga(List<LibroSagaEntity> librosSaga) {
		this.librosSaga = librosSaga;
	}

	@Override
	public String toString() {
		return "SagaEntity [idSaga=" + idSaga + ", nombre=" + nombre + ", tipo=" + tipo + ", librosSaga=" + librosSaga
				+ "]";
	}
    
}
