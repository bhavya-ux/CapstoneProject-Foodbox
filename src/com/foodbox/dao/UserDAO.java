package com.flyaway.dao;

import java.util.List;

import com.flyaway.model.User;

public interface UserDAO {

	public User createuser(User user);
	public boolean checkUser(String userName, String userPassword);
	public List<User> getAllUsers();

}
