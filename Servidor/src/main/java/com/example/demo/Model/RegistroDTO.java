package com.example.demo.Model;

import java.time.LocalDate;

public class RegistroDTO {
	private Long idUser;
	private String user;
	private String correo;
    private String contrasena;
    private LocalDate fechaNacimiento;
    
	public RegistroDTO() {}

	public RegistroDTO(Long idUser, String user, String correo,LocalDate fechaNacimiento) {
		this.idUser = idUser;
		this.user = user;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "RegistroDTO [user=" + user + ", correo=" + correo + ", contrasena=" + contrasena
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
