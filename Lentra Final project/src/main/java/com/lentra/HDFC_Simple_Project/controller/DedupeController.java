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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lentra.HDFC_Simple_Project.entity.Dedupe;
import com.lentra.HDFC_Simple_Project.service.DedupeService_impl;

@RestController
@RequestMapping("/dedupe")
@CrossOrigin
public class DedupeController {

	@Autowired
	DedupeService_impl service;

	@PostMapping
	public ResponseEntity<Dedupe> save(@RequestBody Dedupe dedupe) {
		Dedupe dedup = service.addApplicant(dedupe);
		if (dedup != null) {
			return new ResponseEntity<Dedupe>(dedup, HttpStatus.OK);
		} else {
			return new ResponseEntity<Dedupe>(dedup, HttpStatus.INTERNAL_SERVER_ERROR);

		}
		
	}
	
	@GetMapping("/{ref_id}")
	public ResponseEntity<Dedupe> getApplicantById(@PathVariable String ref_id){
	List<Dedupe> list = service.fetchData();
	Dedupe dedupe=new Dedupe();
	for(Dedupe d: list) {
		if(d.getMobile_no().equals(ref_id)) {
			dedupe=d;
			break;
		}
	}
	
	if(dedupe !=null) {
		return new ResponseEntity<Dedupe>(dedupe,HttpStatus.OK);
	}else {
		return new ResponseEntity<Dedupe>(dedupe,HttpStatus.NO_CONTENT);
	}
	}
	
	
	@GetMapping
	public ResponseEntity<List<Dedupe>> fetch(){
		List<Dedupe> d = service.fetchData();
		if(d !=null) {
			return new ResponseEntity<List<Dedupe>>(d , HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Dedupe>>(d ,HttpStatus.NO_CONTENT);
		}
		
	}
	
	@PostMapping("/checkStatus")
	public ResponseEntity<Map<String, Object>> saveInfo(@RequestBody Dedupe dedupe){
		Map<String, Object> ded = service.checkUser(dedupe);
		if(ded !=null) {
			return new ResponseEntity<Map<String,Object>>(ded,HttpStatus.OK);
		}else {
			return new ResponseEntity<Map<String,Object>>(ded,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}

