package com.lentra.HDFC_Simple_Project.service;


import java.util.List;
import java.util.Map;

import com.lentra.HDFC_Simple_Project.entity.User;

public interface UserService {
	
	public Map<String, Object> login(User user);
	public User getUserById(String mobile_no);
	public User addUser(User user);
	public User updateUser(User user);
	public List<User> getAllUser();
	
}
