package com.flyaway.service.impl;

import java.util.ArrayList;
import java.util.List;


import com.flyaway.dao.UserDAO;
import com.flyaway.dao.impl.UserDAOImpl;
import com.flyaway.model.User;
import com.flyaway.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAO dao = new UserDAOImpl();

	@Override
	public User createuser(User user) {
    return dao.createuser(user);
	}

	@Override
	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}

	@Override
	public List<String> checkUser(String userName, String userPassword) {
		Boolean check;
		check =  dao.checkUser(userName, userPassword) ;
        List<String> response = new ArrayList<>(); 
    	if (check == true)
    	{
            response.add("Login successful");
    		return response;
    	}
    	else
    	{
    	    response.add("Login failed");
      		return response;    	}
	}

}
