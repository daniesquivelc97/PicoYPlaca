package com.uco.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uco.entity.PicoYPlacaVehiculoEntity;
import com.uco.service.PicoYPlacaVehiculoService;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/picoplacaVehiculo")
public class PicoYPlacaVehiculoApi {
	
	@Autowired
	private PicoYPlacaVehiculoService picoYPlacaVehiculoService;
	
	@GetMapping(value="/all")
	public List<PicoYPlacaVehiculoEntity> getRestricciones(){
		return picoYPlacaVehiculoService.getPicoPlacaVehiculos();
	}
	
	@PostMapping(path="/crear", produces ="application/json")
	public PicoYPlacaVehiculoEntity crearUsuarioAdmin(@RequestBody PicoYPlacaVehiculoEntity picoYPlacaVehiculoEntity) {
		return picoYPlacaVehiculoService.crearPicoPlacaVehiculo(picoYPlacaVehiculoEntity);
	}

}
