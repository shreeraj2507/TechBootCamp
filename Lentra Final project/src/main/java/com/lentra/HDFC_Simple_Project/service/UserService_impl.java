package com.lentra.HDFC_Simple_Project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lentra.HDFC_Simple_Project.Dao.UserDao;
import com.lentra.HDFC_Simple_Project.entity.User;


@Service
public class UserService_impl implements UserService {
	
	@Autowired
	UserDao dao;

	@Override
	public User getUserById(String mobile_no) {
		Optional<User> u = dao.findById(mobile_no);
		if(u.isPresent()) {
			return u.get();
		}
		return null;
	}

	@Override
	public User addUser(User user) {
	return dao.save(user);
		
	}

	@Override
	public User updateUser(User user) {
	
		Optional<User> u = dao.findById(user.getMobile_no());
		User usr=new User();
		if(u.isPresent()) {
			usr=u.get();
			/*
			 * usr.setName(user.getName());
			 * 
			 * usr.setEmail_id(user.getEmail_id());
			 */ usr.setMobile_no(user.getMobile_no());
			 
			dao.save(usr);
		}
		return usr;
		
	}

	@Override
	public Map<String, Object> login(User user) {
		List<User> all = dao.findAll();
		Map<String, Object> map=new HashMap<>();
		for(User u:all) {
			if(u.getEmail_id().equals(user.getEmail_id()) &&
					u.getMobile_no().equals(user.getMobile_no()) && 
					u.getName().equals(user.getName())) {
				map.put("msg", "Valid User");
				map.put("user", u);
				break;
			}
			else {
				map.put("msg", "Invalid User");
				map.put("user", null);
			}
				
				
		}
		return map;
	}

	@Override
	public List<User> getAllUser() {
	
		return dao.findAll();
	}



}
