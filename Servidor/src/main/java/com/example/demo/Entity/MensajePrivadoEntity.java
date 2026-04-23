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
    private UsuarioEntity emisor;
	
	@ManyToOne
    @JoinColumn(name = "RECEPTOR_ID", nullable = false)
    private UsuarioEntity receptor;

	
}
