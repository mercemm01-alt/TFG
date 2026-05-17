package com.example.demo.Model;

import java.time.LocalDate;

public class RegistroDTO {
	private Long idUser;
	private String user;
	private String correo;
    private String contrasena;
    private LocalDate fechaNacimiento;
    private LocalDate fechaCambioUser;
    
	public RegistroDTO() {}

	public RegistroDTO(Long idUser, String user, String correo,LocalDate fechaNacimiento, LocalDate fechaCambioUser) {
		this.idUser = idUser;
		this.user = user;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaCambioUser = fechaCambioUser;
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

	public LocalDate getFechaCambioUser() {
		return fechaCambioUser;
	}

	public void setFechaCambioUser(LocalDate fechaCambioUser) {
		this.fechaCambioUser = fechaCambioUser;
	}

	@Override
	public String toString() {
		return "RegistroDTO [idUser=" + idUser + ", user=" + user + ", correo=" + correo + ", contrasena=" + contrasena
				+ ", fechaNacimiento=" + fechaNacimiento + ", fechaCambioUser=" + fechaCambioUser + "]";
	}

}
