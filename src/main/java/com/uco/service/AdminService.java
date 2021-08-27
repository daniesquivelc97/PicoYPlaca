package com.uco.service;

import java.util.List;

import com.uco.entity.AdminEntity;

public interface AdminService {
	
	public List<AdminEntity> getAdmins();
	
	public AdminEntity getUsuarioLogin(String usuario, String password);
	
	public AdminEntity crearUsuarioAdmin(AdminEntity adminEntity);

}
