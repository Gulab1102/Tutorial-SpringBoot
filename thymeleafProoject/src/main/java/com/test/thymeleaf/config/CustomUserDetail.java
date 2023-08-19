package com.test.thymeleaf.config;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.test.thymeleaf.entities.User;

public class CustomUserDetail implements UserDetails{
	
	private User user;

	public CustomUserDetail(User user) {
		super();
		this.user = user;
		
		}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
	SimpleGrantedAuthority simpleGrantedAuthority=	new SimpleGrantedAuthority(user.getRole());
		// TODO Auto-generated method stub
		return List.of(simpleGrantedAuthority);
	}

	@Override
	public String getPassword() {
		
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
