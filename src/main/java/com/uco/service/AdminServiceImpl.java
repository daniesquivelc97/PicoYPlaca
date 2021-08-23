package com.uco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uco.entity.AdminEntity;
import com.uco.repository.AdminRepository;
import com.uco.utilities.Utility;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private AdminService adminService;

	@Override
	public AdminEntity getUsuarioLogin(String email, String password) {
		String claveEncriptada = Utility.encryptText(password);
//		String claveDes = Utility.decryptText(claveEncriptada);
//		System.out.print("Clave encriptada " + claveEncriptada);
//		System.out.print("Clave Desen " + claveDes);
		return adminRepository.findByEmailAndPassword(email, claveEncriptada);
	}

	@Override
	public AdminEntity crearUsuarioAdmin(AdminEntity adminEntity) {
		String claveEncriptada = Utility.encryptText(adminEntity.getPassword());
		adminEntity.setPassword(claveEncriptada);
		return adminRepository.save(adminEntity);
	}

}
