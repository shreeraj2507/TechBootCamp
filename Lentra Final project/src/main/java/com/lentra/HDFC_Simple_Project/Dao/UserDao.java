package com.lentra.HDFC_Simple_Project.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.lentra.HDFC_Simple_Project.entity.User;


@Repository
public interface UserDao  extends MongoRepository<User, String>{

}
