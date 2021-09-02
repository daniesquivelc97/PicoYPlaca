package com.uco.service;

import java.util.List;

import com.uco.entity.PicoYPlacaEntity;

public interface PicoYPlacaService {
	
	public List<PicoYPlacaEntity> getPicoYPlacas();
	
	public PicoYPlacaEntity crearPicoYPlaca(PicoYPlacaEntity picoYPlacaEntity);

}
