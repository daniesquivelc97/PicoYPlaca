package com.uco.service;

import java.util.List;

import com.uco.entity.PicoYPlacaVehiculoEntity;

public interface PicoYPlacaVehiculoService {
	
	public List<PicoYPlacaVehiculoEntity> getPicoPlacaVehiculos();

	public PicoYPlacaVehiculoEntity crearPicoPlacaVehiculo(PicoYPlacaVehiculoEntity picoYPlacaVehiculoEntity);
	
}
