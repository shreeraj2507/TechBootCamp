package com.lentra.HDFC_Simple_Project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lentra.HDFC_Simple_Project.entity.UserLogin1;
import com.lentra.HDFC_Simple_Project.service.UserLogin1Service;

@Controller
@RequestMapping("/userlogin")
public class UserLogin1Controller {
	
	@Autowired
	UserLogin1Service service;
	
	@PostMapping
	public ResponseEntity<UserLogin1> addUser(@RequestBody UserLogin1  userLogin1 ){
		UserLogin1 user = service.addUser(userLogin1); 
		if(user !=null) {
			return new ResponseEntity<UserLogin1>(user,HttpStatus.OK);
		}else {
			return new ResponseEntity<UserLogin1>(user,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/checkUser")
	public ResponseEntity<Map<String, Object>> checkUSer(@RequestBody UserLogin1 login1){
		Map<String, Object> user = service.checkUser(login1);
		if(user !=null) {
			return new ResponseEntity<Map<String,Object>>(user,HttpStatus.OK);
		}else {
			return new ResponseEntity<Map<String,Object>>(user, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping
	public ResponseEntity<List<UserLogin1>> getAllUser(){
		List<UserLogin1> user = service.getAllUser();
		if(user !=null) {
			return new ResponseEntity<List<UserLogin1>>(user,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<UserLogin1>>(user,HttpStatus.NO_CONTENT);
		}
		
	}
	

}
