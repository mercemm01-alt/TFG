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
@Table(name = "LIBRO_GENERO")
public class LibroGeneroEntity implements Serializable{
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LG")
    private long idLg;

    @ManyToOne
    @JoinColumn(name = "LIBRO_ID", nullable = false)
    private LibroEntity libroGenero;

    @ManyToOne
    @JoinColumn(name = "GENERO_ID", nullable = false)
    private GeneroEntity genero;

	public long getIdLg() {
		return idLg;
	}

	public void setIdLg(long idLg) {
		this.idLg = idLg;
	}

	public LibroEntity getLibroGenero() {
		return libroGenero;
	}

	public void setLibroGenero(LibroEntity libroGenero) {
		this.libroGenero = libroGenero;
	}

	public GeneroEntity getGenero() {
		return genero;
	}

	public void setGenero(GeneroEntity genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "LibroGeneroEntity [idLg=" + idLg + ", libroGenero=" + libroGenero + ", genero=" + genero + "]";
	}
    
    
}
