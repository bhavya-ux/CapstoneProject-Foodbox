package com.flyaway.dao;

import java.util.List;

import com.flyaway.model.Order;

public interface OrderDAO {
	public Order createOrder(Order order);
	public List<Order> getAllOrders();
	public void removeOrders(int orderId);
}
