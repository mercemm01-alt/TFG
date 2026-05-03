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
@Table(name="LIBRO")
public class LibroEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_LIBRO")
	private Long idLibro;
	
	@Column(name="ISBN", nullable = false, unique = true, length = 20)
	private String isbn;
	
	@Column(name="TITULO", nullable = false, length = 50)
	private String titulo;
	
	@Column(name="AUTOR", nullable = false, length = 100)
	private String autor;
	
	@Column(name="EDITORIAL", nullable = false, length = 50)
	private String editorial;
	
	@Column(name="NUM_PAGINAS")
	private int numPaginas;
	
	@Column(name="SINOPSIS")
	private String sinopsis;
	
	// Libro - User N:M (USER_LIBRO)
	@OneToMany(mappedBy="libroUser")
	private Set<UserLibroEntity> userLibro = new HashSet<>();
	
	// Libro - Opinion
	@OneToMany(mappedBy="libroOpinio")
	private Set<OpinionEntity> opinionesLibro = new HashSet<>();
	
	@OneToMany(mappedBy = "libroGenero")
	private Set<LibroGeneroEntity> generosLibro = new HashSet<>();

	public Long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public Set<UserLibroEntity> getUserLibro() {
		return userLibro;
	}

	public void setUserLibro(Set<UserLibroEntity> userLibro) {
		this.userLibro = userLibro;
	}

	public Set<OpinionEntity> getOpinionesLibro() {
		return opinionesLibro;
	}

	public void setOpinionesLibro(Set<OpinionEntity> opinionesLibro) {
		this.opinionesLibro = opinionesLibro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
