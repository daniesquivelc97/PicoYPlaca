package com.uco.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import com.vladmihalcea.hibernate.type.array.StringArrayType;

@Entity
@Table(name="picoyplacavehiculo")
public class PicoYPlacaVehiculoEntity implements Serializable{

	private static final long serialVersionUID = 4065663202343417268L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_picoyplaca_vehiculo", nullable=false, insertable=false)
	private Long idPicoYPlacaVehiculo;
	
	@Column(name="tipo_vehiculo")
	private String tipoVehiculo;
	
	@Column(name="dia")
	private String dia;

	@Column(name="digito")
	private String digito;
	
	@ManyToOne
	@JoinColumn(name="id_picoyplaca")
	private PicoYPlacaEntity fechaPicoPlaca;

	public PicoYPlacaVehiculoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PicoYPlacaVehiculoEntity(Long idPicoYPlaca, String tipoVehiculo, String dia, String digito,
			PicoYPlacaEntity fechaPicoPlaca) {
		super();
		this.idPicoYPlacaVehiculo = idPicoYPlaca;
		this.tipoVehiculo = tipoVehiculo;
		this.dia = dia;
		this.digito = digito;
		this.fechaPicoPlaca = fechaPicoPlaca;
	}

	public Long getIdPicoYPlacaVehiculo() {
		return idPicoYPlacaVehiculo;
	}

	public void setIdPicoYPlacaVehiculo(Long idPicoYPlacaVehiculo) {
		this.idPicoYPlacaVehiculo = idPicoYPlacaVehiculo;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getDigito() {
		return digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
	}

	public PicoYPlacaEntity getFechaPicoPlaca() {
		return fechaPicoPlaca;
	}

	public void setFechaPicoPlaca(PicoYPlacaEntity fechaPicoPlaca) {
		this.fechaPicoPlaca = fechaPicoPlaca;
	}

}
