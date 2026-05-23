package com.example.demo.Model;

public class ForoListaDTO {
	
	private Long idForos;
	private String nombre;
	private String descripcion;
	private String img;
	private boolean esMio;
	private boolean siguiendo;
	private boolean favorito;
	
	public ForoListaDTO() {};
	
	public ForoListaDTO(Long idForos, String nombre, String descripcion, String img, boolean esMio, boolean siguiendo,
			boolean favorito) {
		this.idForos = idForos;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.img = img;
		this.esMio = esMio;
		this.siguiendo = siguiendo;
		this.favorito = favorito;
	}

	public Long getIdForos() {
		return idForos;
	}

	public void setIdForos(Long idForos) {
		this.idForos = idForos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public boolean isEsMio() {
		return esMio;
	}

	public void setEsMio(boolean esMio) {
		this.esMio = esMio;
	}

	public boolean isSiguiendo() {
		return siguiendo;
	}

	public void setSiguiendo(boolean siguiendo) {
		this.siguiendo = siguiendo;
	}

	public boolean isFavorito() {
		return favorito;
	}

	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}

	@Override
	public String toString() {
		return "ForoListaDTO [idForos=" + idForos + ", nombre=" + nombre + ", descripcion=" + descripcion + ", img="
				+ img + ", esMio=" + esMio + ", siguiendo=" + siguiendo + ", favorito=" + favorito + "]";
	}
	
	
}
