package com.example.demo.Model;

public class LoginDTO {
	
	private Long idUser;
	private String user;
	private String contrasena;
    
    public LoginDTO() {}

    public LoginDTO(Long idUser, String user) {
    	this.idUser = idUser;
        this.user = user;
    }

	public LoginDTO(String user, String contrasena) {
		this.user = user;
		this.contrasena = contrasena;
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

	public void setUsuario(String user) {
		this.user = user;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "LoginDTO [idUser=" + idUser + ", user=" + user + ", contrasena" + contrasena +"]";
	}
}
