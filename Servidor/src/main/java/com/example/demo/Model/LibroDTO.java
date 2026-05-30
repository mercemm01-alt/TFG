package com.example.demo.Model;

public class LibroDTO {
	
	private Long idLibro;
    private String titulo;
    private String autor;
    private String editorial;
    private Integer numPaginas;
    private String sinopsis;
    private String imagen;
    private String fechaPublicacion;
    private Double valoracion;
    
    public LibroDTO() {};
    
	public LibroDTO(Long idLibro, String titulo, String autor, String editorial, Integer numPaginas, String sinopsis,
			String imagen, String fechaPublicacion, Double valoracion) {
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.numPaginas = numPaginas;
		this.sinopsis = sinopsis;
		this.imagen = imagen;
		this.fechaPublicacion = fechaPublicacion;
		this.valoracion = valoracion;
	}

	public Long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
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

	public Integer getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(Integer numPaginas) {
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

	@Override
	public String toString() {
		return "LibroDTO [idLibro=" + idLibro + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial
				+ ", numPaginas=" + numPaginas + ", sinopsis=" + sinopsis + ", imagen=" + imagen + ", fechaPublicacion="
				+ fechaPublicacion + ", valoracion=" + valoracion + "]";
	}
    
    
}
