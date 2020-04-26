package com.uco.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class UsuariosEntity implements Serializable {
	private static final long serialVersionUID = -2343243243242432351L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", unique=true, nullable=false, insertable=false)
	private Long idUsuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="identificacion")
	private String identificacion;

	public UsuariosEntity() {
		super();
	}

	public UsuariosEntity(Long idUsuario, String nombre, String identificacion) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.identificacion = identificacion;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

}
