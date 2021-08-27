package com.uco.api;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uco.dto.UserDTO;
import com.uco.entity.AdminEntity;
import com.uco.service.AdminService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/admin")
public class AdminApi {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping(value="/all")
	public List<AdminEntity> getAdmins(){
		return adminService.getAdmins();
	}
	
	@PostMapping(path="/login", consumes = "application/json", produces ="application/json")
	public UserDTO login(@RequestBody AdminEntity adminEntity) throws AuthenticationException {
		UserDTO user = new UserDTO();
		adminEntity = adminService.getUsuarioLogin(adminEntity.getEmail(), adminEntity.getPassword());
		if(adminEntity != null) {
//			String password = adminEntity.setPassword("");
			String token = getJWTToken(adminEntity.getEmail());
			user.setEmail(adminEntity.getEmail());
			user.setNombres(adminEntity.getNombre());
			user.setToken(token);	
		} else {
			throw new AuthenticationException("Usuario y/o contraseña incorrecto");
		}
		return user; 
	}
	
	@PostMapping(path="/crear", produces ="application/json")
	public AdminEntity crearUsuarioAdmin(@RequestBody AdminEntity adminEntity) {
		return adminService.crearUsuarioAdmin(adminEntity);
	}
	
	private String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}

}
