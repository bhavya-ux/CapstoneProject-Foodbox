package com.flyaway.service.impl;

import java.util.List;

import com.flyaway.dao.OrderDAO;
import com.flyaway.dao.impl.OrderDAOImpl;
import com.flyaway.model.Order;
import com.flyaway.service.OrderService;

public class OrderServiceImpl implements OrderService {
	private OrderDAO dao = new OrderDAOImpl();
	@Override
	public Order createOrder(Order order) {
		return dao.createOrder(order);
		}

	@Override
	public List<Order> getAllOrders() {
		return dao.getAllOrders();	}

	@Override
	public void removeOrders(int orderId) {
		dao.removeOrders(orderId);
		
	}
	

}
