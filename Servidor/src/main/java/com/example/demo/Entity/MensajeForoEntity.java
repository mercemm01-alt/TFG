package com.example.demo.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="MENSAJE_FORO")
public class MensajeForoEntity implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_MENSAJE_FORO")
	private Long idMensajeForo;
	
	@Column(name="CONTENIDO_MSF", nullable = false)
	private String contenidoMsF;
	
	@Column(name="FECHA", nullable = false)
	private LocalDateTime fecha;
	
	@ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserEntity usuarioMensaje;
	
	@ManyToOne
    @JoinColumn(name = "FORO_ID", nullable = false)
    private ForoEntity foroMensaje;

	public Long getIdMensajeForo() {
		return idMensajeForo;
	}

	public void setIdMensajeForo(Long idMensajeForo) {
		this.idMensajeForo = idMensajeForo;
	}

	public String getContenidoMsF() {
		return contenidoMsF;
	}

	public void setContenidoMsF(String contenidoMsF) {
		this.contenidoMsF = contenidoMsF;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public UserEntity getUsuarioMensaje() {
		return usuarioMensaje;
	}

	public void setUsuarioMensaje(UserEntity usuarioMensaje) {
		this.usuarioMensaje = usuarioMensaje;
	}

	public ForoEntity getForoMensaje() {
		return foroMensaje;
	}

	public void setForoMensaje(ForoEntity foroMensaje) {
		this.foroMensaje = foroMensaje;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
