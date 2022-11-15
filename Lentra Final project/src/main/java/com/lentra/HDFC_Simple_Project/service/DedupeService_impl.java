package com.lentra.HDFC_Simple_Project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lentra.HDFC_Simple_Project.Dao.DedupeDao;
import com.lentra.HDFC_Simple_Project.entity.Dedupe;
import com.lentra.HDFC_Simple_Project.entity.UserLogin1;

@Service
public class DedupeService_impl implements DedupeService {

	@Autowired
	DedupeDao dao;

	@Override
	public Dedupe addApplicant(Dedupe dedupe) {
		return dao.save(dedupe);
		
	}

	public Dedupe getApplicantById(String ref_id) {
	Optional<Dedupe> ded = dao.findById(ref_id);
	if(ded.isPresent()) {
		return ded.get();
	}
		return null;
	}

	@Override
	public List<Dedupe> fetchData() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Map<String, Object> checkUser(Dedupe dedupe) {
	List<Dedupe> ded = dao.findAll(); 
	Map<String, Object> map=new HashMap<>();
	for(Dedupe d:ded) {
		if (
			 d.getRef_id().equals(dedupe.getRef_id()) &&
			  d.getName().equals(dedupe.getName()) &&
			  d.getMobile_no().equals(dedupe.getMobile_no()) &&
			  d.getApplicant_type().equals(dedupe.getApplicant_type()) &&
			  d.getEmail_id().equals(dedupe.getEmail_id()) &&
			 
				d.getDate_of_birth().equals(dedupe.getDate_of_birth()) &&
				
				  d.getDoi().equals(dedupe.getDoi()) &&
				 						
						  d.getExternal_customer_id().equals(dedupe.getExternal_customer_id()) &&
						 				d.getUdyam_no().equals(dedupe.getUdyam_no()) &&
				d.getLoyality_card().equals(dedupe.getLoyality_card()) &
				d.getEmployer_name().equals(dedupe.getEmployer_name()) &&
				d.getKyc_details().equals(dedupe.getKyc_details()) &&
						
						  d.getApplicant_dedupe_check().equals(dedupe.getApplicant_dedupe_check()) 
						 				
				) {
			map.put("msg", "Dedupe Check Successfully");
			map.put("dedupe", d);
		}
		else 
		{
			map.put("msg", "Dedupe Check Unsuccessfull");
			map.put("dedupe", null);
		}
	}
		return map;
	}

	
	

	


	



}
