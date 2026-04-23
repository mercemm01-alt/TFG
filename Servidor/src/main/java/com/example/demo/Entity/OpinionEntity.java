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
@Table(name="OPINION")
public class OpinionEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_OPINION")
	private long idOpinion;
	
	@Column(name="COMENTARIO")
	private String comentario;
	
	@Column(name="VALORACION")
	private int valoracion;
	
	@Column(name="FECHA", nullable = false)
	private LocalDateTime fechaComent;
	
	@ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private UsuarioEntity usuarioOpinion;
	
	@ManyToOne
	@JoinColumn(name="LIBRO_ID", nullable = false)
	private LibroEntity libroOpinio;

	
	
}
