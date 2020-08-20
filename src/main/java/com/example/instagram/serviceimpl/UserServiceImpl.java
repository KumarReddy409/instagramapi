package com.example.instagram.serviceimpl;

import java.awt.desktop.UserSessionListener;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.instagram.entity.User;
import com.example.instagram.repository.UserRepository;
import com.example.instagram.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public User login(String email, String password) {
		// TODO Auto-generated method stub
		return userRepository.login(email, password);
	}

}
