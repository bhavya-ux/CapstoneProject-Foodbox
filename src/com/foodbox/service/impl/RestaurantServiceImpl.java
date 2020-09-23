package com.flyaway.service.impl;

import java.util.List;

import com.flyaway.dao.RestaurantDAO;
import com.flyaway.dao.impl.RestaurantDAOImpl;
import com.flyaway.model.Restaurant;
import com.flyaway.service.RestaurantService;

public class RestaurantServiceImpl implements RestaurantService {
	private RestaurantDAO dao = new RestaurantDAOImpl();
	
	@Override
	public Restaurant createrestaurant(Restaurant restaurant) {
		return dao.createrestaurant(restaurant);
	}

	@Override
	public Restaurant getRestaurantById(int restaurantId) {
		return dao.getRestaurantById(restaurantId);
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		return dao.getAllRestaurants();
	}

	@Override
	public void removeRestaurant(int restaurantId) {
		 dao.removeRestaurant(restaurantId);
		
	}

	@Override
	public List<Restaurant> getRestaurantSearch(String restaurantLocation) {
		return dao.getRestaurantSearch(restaurantLocation);
	}

	
}
