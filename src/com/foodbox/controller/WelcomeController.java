package com.flyaway.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.junit.Test;


@Path("/")
public class WelcomeController 
{
	@Test
	@GET
	public String sayHelloGet()
	{
		return "Welcome to Foodbox Delivery Services";
	}


}
