package com.flyaway.controller;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flyaway.model.User;
import com.flyaway.service.UserService;
import com.flyaway.service.impl.UserServiceImpl;

@Path("/user")
public class UserController {
	
	private UserService service = new UserServiceImpl();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User createuser(User user) {
    return service.createuser(user);
	}
	
	@GET
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}

	@GET
	@Path("/{userName}/{userPassword}")
	public List<String> checkUser(@PathParam("userName")String userName, @PathParam("userPassword")String userPassword){
		return service.checkUser(userName, userPassword);
	}


}
