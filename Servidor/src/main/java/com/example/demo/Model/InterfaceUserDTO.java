package com.example.demo.Model;

import java.util.List;

public class InterfaceUserDTO {
	
	private Long idUser;
	private String user;
	private String contrasena;
	private String imagen;
	private String descripcion;
	private List<String> generos;
	
	public InterfaceUserDTO() {}

	public InterfaceUserDTO(Long idUser, String user, String contrasena, String imagen, String descripcion,
			List<String> generos) {
		super();
		this.idUser = idUser;
		this.user = user;
		this.contrasena = contrasena;
		this.imagen = imagen;
		this.descripcion = descripcion;
		this.generos = generos;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<String> getGeneros() {
		return generos;
	}

	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}

	@Override
	public String toString() {
		return "InterfaceUserDTO [idUser=" + idUser + ", user=" + user + ", contrasena=" + contrasena + ", imagen="
				+ imagen + ", descripcion=" + descripcion + ", generos=" + generos + "]";
	}

}
