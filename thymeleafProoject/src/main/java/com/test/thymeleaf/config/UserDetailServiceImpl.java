package com.test.thymeleaf.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.test.thymeleaf.dao.UserRepo;
import com.test.thymeleaf.entities.User;

public class UserDetailServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepo.getUserByUserName(username);
		System.out.println(user+" Hi");
		
		if(user==null) {
		  throw new UsernameNotFoundException("Could not found User !!");
		}
		
		CustomUserDetail customUserDetail=new CustomUserDetail(user);
		return customUserDetail;
		
		
	}

}
