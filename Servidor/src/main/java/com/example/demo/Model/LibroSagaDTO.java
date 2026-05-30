package com.example.demo.Model;

public class LibroSagaDTO {
	
	private Long idLibro;
    private Long idSaga;
    private Integer numeroOrden;
    
    public LibroSagaDTO() {};
    
	public LibroSagaDTO(Long idLibro, Long idSaga, Integer numeroOrden) {
		this.idLibro = idLibro;
		this.idSaga = idSaga;
		this.numeroOrden = numeroOrden;
	}

	public Long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}

	public Long getIdSaga() {
		return idSaga;
	}

	public void setIdSaga(Long idSaga) {
		this.idSaga = idSaga;
	}

	public Integer getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(Integer numeroOrden) {
		this.numeroOrden = numeroOrden;
	}

	@Override
	public String toString() {
		return "LibroSagaDTO [idLibro=" + idLibro + ", idSaga=" + idSaga + ", numeroOrden=" + numeroOrden + "]";
	}
    
    
}
