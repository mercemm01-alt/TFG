package com.example.demo.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="USUARIO_FORO")
public class UserForoEntity implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_UF")
	private Long idUf;
	
	@Column(name="SIGUIENDO")
	private Boolean siguiendo = false;
	
	@Column(name="FAVORITO")
	private Boolean favorito = false;
	
	@ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserEntity usuario;
	
	@ManyToOne
    @JoinColumn(name = "FORO_ID", nullable = false)
    private ForoEntity foro;

	public Long getIdUf() {
		return idUf;
	}

	public void setIdUf(Long idUf) {
		this.idUf = idUf;
	}

	public Boolean getSiguiendo() {
		return siguiendo;
	}

	public void setSiguiendo(Boolean siguiendo) {
		this.siguiendo = siguiendo;
	}

	public Boolean getFavorito() {
		return favorito;
	}

	public void setFavorito(Boolean favorito) {
		this.favorito = favorito;
	}

	public UserEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UserEntity usuario) {
		this.usuario = usuario;
	}

	public ForoEntity getForo() {
		return foro;
	}

	public void setForo(ForoEntity foro) {
		this.foro = foro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "UserForoEntity [idUf=" + idUf + ", siguiendo=" + siguiendo + ", favorito=" + favorito + ", usuario="
				+ usuario + ", foro=" + foro + "]";
	}

	

}
