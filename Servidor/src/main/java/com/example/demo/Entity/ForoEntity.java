package com.example.demo.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
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
	private Long idForo;
	
	@Column(name="NOMBRE", unique = true, nullable = false, length = 25)
	private String nombre;
	
	@Column(name="DESCRIPCION", nullable = false, length = 250)
	private String descripcion;
	
	@Column(name="IMAGEN", length = 200)
	private String img;
	
	@Column(name="FECHA_CREACION", nullable = false)
	private LocalDateTime fechaCreacion;
	
	@ManyToOne
	@JoinColumn(name = "CREADOR_ID", nullable = false)
	private UserEntity creador;
	
	@OneToMany(mappedBy="foroMensaje",  cascade = CascadeType.ALL)
	private Set<MensajeForoEntity> mensajesEnviadosF = new HashSet<>();

	public Long getIdForo() {
		return idForo;
	}

	public void setIdForo(Long idForo) {
		this.idForo = idForo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
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

	@Override
	public String toString() {
		return "ForoEntity [idForo=" + idForo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", img=" + img
				+ ", fechaCreacion=" + fechaCreacion + ", creador=" + creador + ", mensajesEnviadosF="
				+ mensajesEnviadosF + "]";
	}

}
