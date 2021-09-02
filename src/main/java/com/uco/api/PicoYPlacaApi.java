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

import com.uco.entity.PicoYPlacaEntity;
import com.uco.service.PicoYPlacaService;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/picoyplacaAdmin")
public class PicoYPlacaApi {
	
	@Autowired
	private PicoYPlacaService picoYPlacaService;

	@GetMapping(value="/all")
	public List<PicoYPlacaEntity> getPicoYPlacas(){
		return picoYPlacaService.getPicoYPlacas();
	}
	
	@PostMapping(path="/crear", produces ="application/json")
	public PicoYPlacaEntity crearPicoYPlaca(@RequestBody PicoYPlacaEntity picoYPlacaEntity) {
		return picoYPlacaService.crearPicoYPlaca(picoYPlacaEntity);
	}
}
