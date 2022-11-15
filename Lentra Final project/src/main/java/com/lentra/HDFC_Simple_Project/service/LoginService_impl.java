package com.lentra.HDFC_Simple_Project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lentra.HDFC_Simple_Project.Dao.LoginDao;
import com.lentra.HDFC_Simple_Project.entity.Login;


@Service
public class LoginService_impl implements LoginService {
	
	
	@Autowired
	LoginDao dao;

	@Override
	public Login addUser(Login login) {
		
		return dao.save(login) ;
	}

	@Override
	public Map<String, Object> login(Login login) {
		List<Login> all = dao.findAll();
		Map<String, Object> map=new HashMap<>();
		for(Login l:all) {
			
			if(l.getUsername().equals(login.getUsername()) && 
					l.getPassword().equals(l.getPassword())) {
				map.put("msg", "Valid User");
				map.put("login", l);
				break;
			}
			else {
				map.put("msg", "Invalid User");
				map.put("login", null);
				
			}
			
		}
		return map;
	}

	@Override
	public List<Login> getAll() {
		
		return dao.findAll();
	}

}
