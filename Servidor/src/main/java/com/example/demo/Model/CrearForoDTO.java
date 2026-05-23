package com.example.demo.Model;

public class CrearForoDTO {
	
	private String nombre;
	private String descripcion;
	private String image;
	
	public CrearForoDTO() {};
	
	public CrearForoDTO(String nombre, String descripcion, String image) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.image = image;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "CrearForoDTO [nombre=" + nombre + ", descripcion=" + descripcion + ", image=" + image + "]";
	}
	
	
}
