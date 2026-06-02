package com.example.demo.Model;

import java.time.LocalDateTime;

public class OpinionDTO {

    private Long idUser;
    private int valoracion;
    private String comentario;
    private LocalDateTime fechaComent;

    public OpinionDTO() {}

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

	public LocalDateTime getFechaComent() {
		return fechaComent;
	}

	public void setFechaComent(LocalDateTime fechaComent) {
		this.fechaComent = fechaComent;
	}

	@Override
	public String toString() {
		return "OpinionDTO [idUser=" + idUser + ", valoracion=" + valoracion + ", comentario=" + comentario + "]";
	}
    
    
}
