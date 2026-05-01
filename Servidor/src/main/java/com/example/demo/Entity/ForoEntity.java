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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="FORO")
public class ForoEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_FORO")
	private long idForo;
	
	@Column(name="NOMBRE", unique = true, nullable = false, length = 25)
	private String nombre;
	
	@Column(name="FECHA_CREACION", nullable = false)
	private LocalDate fechaCreacion;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID", nullable = false)
	private UserEntity creador;
	
	@OneToMany(mappedBy="foroMensaje")
	private Set<MensajeForoEntity> mensajesEnviadosF = new HashSet<>();

	public long getIdForo() {
		return idForo;
	}

	public void setIdForo(long idForo) {
		this.idForo = idForo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public UserEntity getCreador() {
		return creador;
	}

	public void setCreador(UserEntity creador) {
		this.creador = creador;
	}

	public Set<MensajeForoEntity> getMensajesEnviadosF() {
		return mensajesEnviadosF;
	}

	public void setMensajesEnviadosF(Set<MensajeForoEntity> mensajesEnviadosF) {
		this.mensajesEnviadosF = mensajesEnviadosF;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	
	
}
