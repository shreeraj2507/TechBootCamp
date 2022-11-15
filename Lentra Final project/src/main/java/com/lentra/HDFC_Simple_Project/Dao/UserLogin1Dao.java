package com.lentra.HDFC_Simple_Project.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.lentra.HDFC_Simple_Project.entity.UserLogin1;


@Repository
public interface UserLogin1Dao extends MongoRepository<UserLogin1, String>{

}
