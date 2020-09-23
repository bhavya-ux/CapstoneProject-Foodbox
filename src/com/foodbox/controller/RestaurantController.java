package com.flyaway.controller;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flyaway.model.Restaurant;
import com.flyaway.service.RestaurantService;
import com.flyaway.service.impl.RestaurantServiceImpl;

@Path("/restaurant")
public class RestaurantController {
	private RestaurantService service = new RestaurantServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Restaurant createrestaurant(Restaurant restaurant) {
		return service.createrestaurant(restaurant);
	}

	@GET
	@Path("/{restaurantId}")
	public Restaurant getRestaurantById(@PathParam("restaurantId")int restaurantId) {
		return service.getRestaurantById(restaurantId);
	}

	@GET
	public List<Restaurant> getAllRestaurants() {
		return service.getAllRestaurants();
	}

	@DELETE
	@Path("/{restaurantId}")
	public void removeRestaurant(@PathParam("restaurantId")int restaurantId) {
		 service.removeRestaurant(restaurantId);
		
	}

	@GET
    @Path("/{restaurantLocation}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Restaurant> getRestaurantSearch(@PathParam("restaurantLocation")String restaurantLocation) {
		return service.getRestaurantSearch(restaurantLocation);
	}

	
}
