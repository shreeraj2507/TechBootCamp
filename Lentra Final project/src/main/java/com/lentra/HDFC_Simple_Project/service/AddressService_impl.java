package com.lentra.HDFC_Simple_Project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lentra.HDFC_Simple_Project.Dao.AddressDao;
import com.lentra.HDFC_Simple_Project.entity.Address;

@Service
public class AddressService_impl implements AddressService {

	@Autowired
	AddressDao dao;



	@Override
	public Address addAllEmployee(Address address) {
		return dao.save(address);

		
	}
}
