package com.GreenStitch.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.GreenStitch.model.UserData;


public class MyUserDetails implements UserDetails {

	private UserData user;
	
	public MyUserDetails(UserData user) {
		this.user= user;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		
		SimpleGrantedAuthority sga = new SimpleGrantedAuthority(user.getRole());
		authorities.add(sga);
		return authorities;
	}

	@Override
	public String getPassword() {
		// Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// Auto-generated method stub
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// Auto-generated method stub
		return true;
	}

}
