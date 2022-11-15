package com.lentra.HDFC_Simple_Project.service;

import java.util.List;
import java.util.Map;

import com.lentra.HDFC_Simple_Project.entity.Login;


public interface LoginService {
	
	public Login addUser(Login login);
	
	public Map<String, Object> login(Login login);
	
	public List<Login> getAll();
	

}
