package com.example.demo.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO_GENERO")
public class UserGeneroEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_UG")
    private long idUg;

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserEntity usuario;

    @ManyToOne
    @JoinColumn(name = "GENERO_ID", nullable = false)
    private GeneroEntity genero;

	public long getIdUg() {
		return idUg;
	}

	public void setIdUg(long idUg) {
		this.idUg = idUg;
	}

	public UserEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UserEntity usuario) {
		this.usuario = usuario;
	}

	public GeneroEntity getGenero() {
		return genero;
	}

	public void setGenero(GeneroEntity genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "UserGeneroEntity [idUg=" + idUg + ", usuario=" + usuario + ", genero=" + genero + "]";
	}
    
    
}
