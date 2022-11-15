package com.lentra.HDFC_Simple_Project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lentra.HDFC_Simple_Project.entity.Login;
import com.lentra.HDFC_Simple_Project.service.LoginService;

@RestController
@RequestMapping("/userLogin")
@CrossOrigin
public class LoginController {
	
	@Autowired
	LoginService service;
	
	
	@PostMapping("/login")
    public 	ResponseEntity<Map<String, Object>> checkUserLogin(@RequestBody Login login){
		Map<String, Object> map = service.login(login);
		if(map !=null) {
			return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
		}else {
			return new ResponseEntity<Map<String,Object>>(map,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    
	@PostMapping
	public ResponseEntity<Login> addUSer(@RequestBody Login login){
		Login log = service.addUser(login);
		if(log !=null) {
			return new ResponseEntity<Login>(log,HttpStatus.OK);
		}else {
			return new ResponseEntity<Login>(log,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping
	public ResponseEntity<List<Login>> get(){
		List<Login> log = service.getAll();
		if(log !=null) {
			return new ResponseEntity<List<Login>>(log,HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Login>>(log,HttpStatus.NO_CONTENT);
		}
	}

}
