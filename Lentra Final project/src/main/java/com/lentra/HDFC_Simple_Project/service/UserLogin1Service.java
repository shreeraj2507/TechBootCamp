package com.lentra.HDFC_Simple_Project.service;

import java.util.List;
import java.util.Map;

import com.lentra.HDFC_Simple_Project.entity.UserLogin1;

public interface UserLogin1Service {
	
	public UserLogin1 addUser(UserLogin1 userLogin1);
	
	public Map<String, Object> checkUser(UserLogin1 userLogin1);
	
	public List<UserLogin1> getAllUser();
}
