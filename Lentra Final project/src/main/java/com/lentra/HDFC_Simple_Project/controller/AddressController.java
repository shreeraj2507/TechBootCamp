package com.lentra.HDFC_Simple_Project.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lentra.HDFC_Simple_Project.entity.Address;
import com.lentra.HDFC_Simple_Project.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	AddressService service;



	@PostMapping()
	public ResponseEntity<Address> addAddress(@RequestBody Address addresses) {
		Address add = service.addAllEmployee(addresses);
		if (add != null) {
			return new ResponseEntity<Address>(add, HttpStatus.OK);
		} else {
			return new ResponseEntity<Address>(add, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
