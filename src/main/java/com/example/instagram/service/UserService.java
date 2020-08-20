package com.example.instagram.service;

import com.example.instagram.entity.User;

public interface UserService {
	
	
	void save(User user);
	User login(String email,String password);
	

}
