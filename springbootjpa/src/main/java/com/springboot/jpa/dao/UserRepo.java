package com.springboot.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.entities.User;
//@Repository
public interface UserRepo extends CrudRepository<User,Integer>{
	
	

}
