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
    private UserEntity usuarioOpinion;
	
	@ManyToOne
	@JoinColumn(name="LIBRO_ID", nullable = false)
	private LibroEntity libroOpinio;

	public long getIdOpinion() {
		return idOpinion;
	}

	public void setIdOpinion(long idOpinion) {
		this.idOpinion = idOpinion;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public LocalDateTime getFechaComent() {
		return fechaComent;
	}

	public void setFechaComent(LocalDateTime fechaComent) {
		this.fechaComent = fechaComent;
	}

	public UserEntity getUsuarioOpinion() {
		return usuarioOpinion;
	}

	public void setUsuarioOpinion(UserEntity usuarioOpinion) {
		this.usuarioOpinion = usuarioOpinion;
	}

	public LibroEntity getLibroOpinio() {
		return libroOpinio;
	}

	public void setLibroOpinio(LibroEntity libroOpinio) {
		this.libroOpinio = libroOpinio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
