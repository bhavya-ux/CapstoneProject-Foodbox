package com.flyaway.service;

import java.util.List;

import com.flyaway.model.Order;

public interface OrderService {
	public Order createOrder(Order order);
	public List<Order> getAllOrders();
	public void removeOrders(int orderId);

}
