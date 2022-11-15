package com.lentra.HDFC_Simple_Project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lentra.HDFC_Simple_Project.Dao.UserLogin1Dao;
import com.lentra.HDFC_Simple_Project.entity.UserLogin1;



@Service
public class USerLogin1Service_impl implements UserLogin1Service {
	
	
	@Autowired
	UserLogin1Dao dao;

	@Override
	public UserLogin1 addUser(UserLogin1 userLogin1) {
	
		return dao.insert(userLogin1);
	}

	@Override
	public Map<String, Object> checkUser(UserLogin1 userLogin1) {
		List<UserLogin1> all = dao.findAll();
		Map<String, Object> map=new HashMap<>();
		for(UserLogin1 user:all) {
			if(user.getMobileNumber().equals(userLogin1.getMobileNumber()) && 
					user.getEmailId().equals(userLogin1.getEmailId()) && 
					user.getName().equals(userLogin1.getName()) && 
					user.getRefId().equals(userLogin1.getRefId())
					&& user.getExternalId().equals(userLogin1.getExternalId()))
			
			{
				
				map.put("msg", "Valid User");
				map.put("userLogin1", user);
				break;
				
			}
			else 
			{
				map.put("msg", "Invalid User");
				map.put("userLogin1", null);
			}
		}
		        return map;
	}

	@Override
	public List<UserLogin1> getAllUser() {
		
		return dao.findAll();
	}

	

}
