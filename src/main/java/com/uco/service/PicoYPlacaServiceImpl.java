package com.uco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uco.entity.PicoYPlacaEntity;
import com.uco.repository.PicoYPlacaRepository;

@Service
public class PicoYPlacaServiceImpl implements PicoYPlacaService {
	
	@Autowired
	private PicoYPlacaRepository picoYPlacaRepository;

	@Override
	public List<PicoYPlacaEntity> getPicoYPlacas() {
		return (List<PicoYPlacaEntity>) picoYPlacaRepository.findAll();
	}

	@Override
	public PicoYPlacaEntity crearPicoYPlaca(PicoYPlacaEntity picoYPlacaEntity) {
		return picoYPlacaRepository.save(picoYPlacaEntity);
	}

}
