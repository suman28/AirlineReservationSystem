package com.ars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ars.models.User;
import com.ars.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(String username) {
		return userRepository.findOne(username);
	}

	@Override
	public User createUser(User user) {
		return userRepository.saveAndFlush(user);
	}

}
