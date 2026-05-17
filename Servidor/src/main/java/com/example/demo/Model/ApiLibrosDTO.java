package com.example.demo.Model;

import java.util.List;

public class ApiLibrosDTO {
	
	private String apiLibrosId;
    private String titulo;
    private List<String> autores;
    private String imagen;
    private List<String> generos;
    private String sinopsis;

    public ApiLibrosDTO() {}

    public ApiLibrosDTO(String apiLibrosId, String titulo, List<String> autores, String imagen,List<String> generos, String sinopsis) {
        this.apiLibrosId = apiLibrosId;
        this.titulo = titulo;
        this.autores = autores;
        this.imagen = imagen;
        this.generos = generos;
        this.sinopsis = sinopsis;
    }

    public String getApiLibrosId() {
        return apiLibrosId;
    }

    public void setApiLibrosId(String apiLibrosId) {
        this.apiLibrosId = apiLibrosId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	@Override
	public String toString() {
		return "ApiLibrosDTO [apiLibrosId=" + apiLibrosId + ", titulo=" + titulo + ", autores=" + autores + ", imagen="
				+ imagen + ", generos=" + generos + ", sinopsis=" + sinopsis + "]";
	}
  
}
