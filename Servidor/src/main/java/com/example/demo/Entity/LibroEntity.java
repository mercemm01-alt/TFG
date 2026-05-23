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
	
	@Column(name="API_ID", unique = true, length = 20)
	private String apiId;
	
	@Column(name="ISBN", unique = true, length = 20)
	private String isbn;
	
	@Column(name="TITULO", nullable = false, length = 300)
	private String titulo;
	
	@Column(name="AUTOR", nullable = false, length = 300)
	private String autor;
	
	@Column(name="EDITORIAL",  length = 250)
	private String editorial;
	
	@Column(name="NUM_PAGINAS")
	private int numPaginas;
	
	@Column(name="SINOPSIS")
	private String sinopsis;
	
	@Column(name="IMAGEN")
	private String imagen;


	@Column(name="FECHA_PUBLICACION")
	private String fechaPublicacion;


	@Column(name="VALORACION")
	private Double valoracion;


	@Column(name="TIPO")
	private String tipo;
	
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

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public Double getValoracion() {
		return valoracion;
	}

	public void setValoracion(Double valoracion) {
		this.valoracion = valoracion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public Set<LibroGeneroEntity> getGenerosLibro() {
		return generosLibro;
	}

	public void setGenerosLibro(Set<LibroGeneroEntity> generosLibro) {
		this.generosLibro = generosLibro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "LibroEntity [idLibro=" + idLibro + ", apiId=" + apiId + ", isbn=" + isbn + ", titulo=" + titulo
				+ ", autor=" + autor + ", editorial=" + editorial + ", numPaginas=" + numPaginas + ", sinopsis="
				+ sinopsis + ", imagen=" + imagen + ", fechaPublicacion=" + fechaPublicacion + ", valoracion="
				+ valoracion + ", tipo=" + tipo + ", userLibro=" + userLibro + ", opinionesLibro=" + opinionesLibro
				+ ", generosLibro=" + generosLibro + "]";
	}

	
	
	
	
}