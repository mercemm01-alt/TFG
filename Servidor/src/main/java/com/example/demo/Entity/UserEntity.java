package com.example.demo.Entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="USUARIO")
public class UserEntity  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_USER")
	private long idUser;
	
	@Column(name="USUARIO", nullable = false, unique = true, length = 25)
	private String user;
	
	@Column(name="CORREO", nullable = false, unique = true, length = 50)
	private String correo;
	
	@Column(name="CONTRASENA", nullable = false, length = 50)
	private String contrasena;
	
	@Column(name="FECHA_NACIMIENTO", nullable = false)
	private LocalDate fechaNacimiento;
	
	// User - Libros N:M (USER_LIBRO)
	@OneToMany(mappedBy="usuarioLibro")
	private Set<UserLibroEntity> userLibro = new HashSet<>();
	
	// User - Foro N:M (USER_FORO)
	@OneToMany(mappedBy="creador")
	private Set<UserForoEntity> creadorForo = new HashSet<>();
	
	// User - Opinion 1:N
	@OneToMany(mappedBy="usuarioOpinion")
	private Set<OpinionEntity> opinionUser = new HashSet<>();
	
	@OneToMany(mappedBy="emisor")
	private Set<MensajePrivadoEntity> mensajesEnviadosP = new HashSet<>();
	
	@OneToMany(mappedBy="receptor")
	private Set<MensajePrivadoEntity> mensajesRecibidos = new HashSet<>();

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Set<UserLibroEntity> getUserLibro() {
		return userLibro;
	}

	public void setUserLibro(Set<UserLibroEntity> userLibro) {
		this.userLibro = userLibro;
	}

	public Set<UserForoEntity> getCreadorForo() {
		return creadorForo;
	}

	public void setCreadorForo(Set<UserForoEntity> creadorForo) {
		this.creadorForo = creadorForo;
	}

	public Set<OpinionEntity> getOpinionUser() {
		return opinionUser;
	}

	public void setOpinionUser(Set<OpinionEntity> opinionUser) {
		this.opinionUser = opinionUser;
	}

	public Set<MensajePrivadoEntity> getMensajesEnviadosP() {
		return mensajesEnviadosP;
	}

	public void setMensajesEnviadosP(Set<MensajePrivadoEntity> mensajesEnviadosP) {
		this.mensajesEnviadosP = mensajesEnviadosP;
	}

	public Set<MensajePrivadoEntity> getMensajesRecibidos() {
		return mensajesRecibidos;
	}

	public void setMensajesRecibidos(Set<MensajePrivadoEntity> mensajesRecibidos) {
		this.mensajesRecibidos = mensajesRecibidos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
