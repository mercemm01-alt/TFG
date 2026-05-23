package com.example.demo.Model;

public class CrearMensajeDTO {
	
	private Long idForo;
	private String contenido;
	
	public CrearMensajeDTO() {};
	
	public CrearMensajeDTO(Long idForo, String contenido) {
		this.idForo = idForo;
		this.contenido = contenido;
	}

	public Long getIdForo() {
		return idForo;
	}

	public void setIdForo(Long idForo) {
		this.idForo = idForo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "CrearMenasjeDTO [idForo=" + idForo + ", contenido=" + contenido + "]";
	}
	
	
}
