package com.lentra.HDFC_Simple_Project.service;

import java.util.List;
import java.util.Map;
import com.lentra.HDFC_Simple_Project.entity.Dedupe;


public interface DedupeService {
	
	
	public Dedupe addApplicant(Dedupe dedupe);
	
	public Dedupe getApplicantById(String ref_id);
	 
	public List<Dedupe> fetchData();
	
	public Map<String, Object> checkUser(Dedupe dedupe);
	

}
