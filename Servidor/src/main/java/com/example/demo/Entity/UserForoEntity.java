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
@Table(name="USUARIO_FORO")
public class UserForoEntity implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_UF")
	private long idUf;
	
	@ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private UsuarioEntity creador;
	
	@ManyToOne
    @JoinColumn(name = "FORO_ID", nullable = false)
    private ForoEntity foro;

	

}
