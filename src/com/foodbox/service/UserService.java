package com.flyaway.service;

import java.util.List;

import com.flyaway.model.User;

public interface UserService {
	public User createuser(User user);
    public List<String> checkUser(String userName, String userPassword);
	public List<User> getAllUsers();
}
