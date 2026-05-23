package com.example.demo.Model;

import java.time.LocalDateTime;

public class MensajeForoDTO {
	
	private Long idMensaje;
	private String username;
	private String contenido;
	private boolean esMio;
	private boolean esCreador;
	private LocalDateTime fecha;
	
	public MensajeForoDTO() {};
	
	public MensajeForoDTO(Long idMensaje, String username, String contenido, boolean esMio, boolean esCreador,
			LocalDateTime fecha) {
		this.idMensaje = idMensaje;
		this.username = username;
		this.contenido = contenido;
		this.esMio = esMio;
		this.esCreador = esCreador;
		this.fecha = fecha;
	}

	public Long getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(Long idMensaje) {
		this.idMensaje = idMensaje;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public boolean isEsMio() {
		return esMio;
	}

	public void setEsMio(boolean esMio) {
		this.esMio = esMio;
	}

	public boolean isEsCreador() {
		return esCreador;
	}

	public void setEsCreador(boolean esCreador) {
		this.esCreador = esCreador;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "MensajeForoDTO [idMensaje=" + idMensaje + ", username=" + username + ", contenido=" + contenido
				+ ", esMio=" + esMio + ", esCreador=" + esCreador + ", fecha=" + fecha + "]";
	}
	
	
	
}
