package com.example.demo.Entity;

import java.io.Serializable;
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
@Table(name = "GENERO")
public class GeneroEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GENERO")
    private long idGenero;

    @Column(name = "NOMBRE", unique = true, nullable = false, length = 50)
    private String nombre;

    @OneToMany(mappedBy = "genero")
    private Set<UserGeneroEntity> usuarios = new HashSet<>();

    @OneToMany(mappedBy = "genero")
    private Set<LibroGeneroEntity> libros = new HashSet<>();
	public long getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(long idGenero) {
		this.idGenero = idGenero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<UserGeneroEntity> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<UserGeneroEntity> usuarios) {
		this.usuarios = usuarios;
	}

	public Set<LibroGeneroEntity> getLibros() {
		return libros;
	}

	public void setLibros(Set<LibroGeneroEntity> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "GeneroEntity [idGenero=" + idGenero + ", nombre=" + nombre + ", usuarios=" + usuarios + ", libros="
				+ libros + "]";
	}

    
}
