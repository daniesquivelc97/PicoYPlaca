package com.uco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uco.entity.AdminEntity;
import com.uco.repository.AdminRepository;
import com.uco.utilities.Utility;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public AdminEntity getUsuarioLogin(String email, String password) {
		String claveEncriptada = Utility.encryptText(password);
		return adminRepository.findByEmailAndPassword(email, claveEncriptada);
	}

	@Override
	public AdminEntity crearUsuarioAdmin(AdminEntity adminEntity) {
		String claveEncriptada = Utility.encryptText(adminEntity.getPassword());
		adminEntity.setPassword(claveEncriptada);
		return adminRepository.save(adminEntity);
	}

	@Override
	public List<AdminEntity> getAdmins() {
		return (List<AdminEntity>) adminRepository.findAll();
	}

	

}
