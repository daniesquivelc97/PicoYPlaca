package com.uco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uco.entity.PicoYPlacaVehiculoEntity;
import com.uco.repository.PicoYPlacaVehiculoRepository;

@Service
public class PicoYPlacaVehiculoServiceImpl implements PicoYPlacaVehiculoService {

	@Autowired
	private PicoYPlacaVehiculoRepository picoYPlacaVehiculoRepository;
	
	@Override
	public List<PicoYPlacaVehiculoEntity> getPicoPlacaVehiculos() {
		return (List<PicoYPlacaVehiculoEntity>) picoYPlacaVehiculoRepository.findAll();
	}

	@Override
	public PicoYPlacaVehiculoEntity crearPicoPlacaVehiculo(PicoYPlacaVehiculoEntity picoYPlacaVehiculoEntity) {
		return picoYPlacaVehiculoRepository.save(picoYPlacaVehiculoEntity);
	}

}
