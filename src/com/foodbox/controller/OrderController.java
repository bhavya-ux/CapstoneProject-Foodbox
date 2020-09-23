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

import com.flyaway.model.Order;
import com.flyaway.service.OrderService;
import com.flyaway.service.impl.OrderServiceImpl;

@Path("/order")
public class OrderController {

	private OrderService service = new OrderServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Order createOrder(Order order) {
		return service.createOrder(order);
		}

	@GET
	public List<Order> getAllOrders() {
		return service.getAllOrders();	}

	@DELETE
	@Path("/{orderId}")
	public void removeOrders(@PathParam("orderId")int orderId) {
		service.removeOrders(orderId);
		
	}


}
