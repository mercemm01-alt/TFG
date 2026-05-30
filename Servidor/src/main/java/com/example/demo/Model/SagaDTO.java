package com.example.demo.Model;

import com.example.demo.Entity.TipoSaga;

public class SagaDTO {
	
	private Long idSaga;
    private String nombre;
    private TipoSaga tipo;
    
    public SagaDTO() {};
    
	public SagaDTO(Long idSaga, String nombre, TipoSaga tipo) {
		this.idSaga = idSaga;
		this.nombre = nombre;
		this.tipo = tipo;
	}

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

	@Override
	public String toString() {
		return "SagaDTO [idSaga=" + idSaga + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}
    
	
    
}
