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
public class UsuarioEntity  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_USER")
	private long idUser;
	
	@Column(name="USUARIO", nullable = false, unique = true, length = 25)
	private String usuario;
	
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
	

	
}
