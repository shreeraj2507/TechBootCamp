package com.lentra.HDFC_Simple_Project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lentra.HDFC_Simple_Project.entity.User;
import com.lentra.HDFC_Simple_Project.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	@Autowired
	UserService service;

	@PostMapping("/login")
	public ResponseEntity<Map<String, Object>> checkLogin(@RequestBody User user) {
		Map<String, Object> map = service.login(user);
		if (map != null) {
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		} else {
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping()
	public ResponseEntity<User> addUser(@RequestBody User user) {

		User usr = service.addUser(user);
		if (usr != null) {
			return new ResponseEntity<User>(usr, HttpStatus.OK);
		} else {
			return new ResponseEntity<User>(usr, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/{mobile_no}")
	public ResponseEntity<User> getUserById(@PathVariable String mobile_no) {
		User usr = service.getUserById(mobile_no);
		if (usr != null) {
			return new ResponseEntity<User>(usr, HttpStatus.OK);
		} else {
			return new ResponseEntity<User>(usr, HttpStatus.NO_CONTENT);
		}
	}

	@PutMapping
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		User usr = service.updateUser(user);
		if (usr != null) {
			return new ResponseEntity<User>(usr, HttpStatus.OK);
		} else {
			return new ResponseEntity<User>(usr, HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping
	public ResponseEntity<List<User>> getAllUser() {
		List<User> usr = service.getAllUser();
		if (usr != null) {
			return new ResponseEntity<List<User>>(usr, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<User>>(usr, HttpStatus.NO_CONTENT);
		}
	}

}
