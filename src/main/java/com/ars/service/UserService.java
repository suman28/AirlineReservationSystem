package com.ars.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ars.models.User;


public interface UserService {

	public List<User> getUsers();

	public User getUser(String username);

	public User createUser(User user);
	
}
