package com.flyaway.service;

import java.util.List;

import com.flyaway.model.Restaurant;

public interface RestaurantService {
	public Restaurant createrestaurant(Restaurant restaurant);
	public Restaurant  getRestaurantById(int restaurantId);
	public List<Restaurant> getAllRestaurants();
	public void removeRestaurant(int restaurantId);
	public List<Restaurant> getRestaurantSearch(String restaurantLocation);
}
