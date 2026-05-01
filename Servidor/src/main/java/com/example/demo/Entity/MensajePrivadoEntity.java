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
@Table(name="MENSAJE_PRIVADO")
public class MensajePrivadoEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_MENSAJE_PRIVADO")
	private long idMensajePriv;
	
	@Column(name="CONTENIDO_MSP", nullable = false)
	private String contenidoMsP;
	
	@Column(name="FECHA", nullable = false)
	private LocalDateTime fechaConteMsp;
	
	@ManyToOne
    @JoinColumn(name = "EMISOR_ID", nullable = false)
    private UserEntity emisor;
	
	@ManyToOne
    @JoinColumn(name = "RECEPTOR_ID", nullable = false)
    private UserEntity receptor;

	public long getIdMensajePriv() {
		return idMensajePriv;
	}

	public void setIdMensajePriv(long idMensajePriv) {
		this.idMensajePriv = idMensajePriv;
	}

	public String getContenidoMsP() {
		return contenidoMsP;
	}

	public void setContenidoMsP(String contenidoMsP) {
		this.contenidoMsP = contenidoMsP;
	}

	public LocalDateTime getFechaConteMsp() {
		return fechaConteMsp;
	}

	public void setFechaConteMsp(LocalDateTime fechaConteMsp) {
		this.fechaConteMsp = fechaConteMsp;
	}

	public UserEntity getEmisor() {
		return emisor;
	}

	public void setEmisor(UserEntity emisor) {
		this.emisor = emisor;
	}

	public UserEntity getReceptor() {
		return receptor;
	}

	public void setReceptor(UserEntity receptor) {
		this.receptor = receptor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
