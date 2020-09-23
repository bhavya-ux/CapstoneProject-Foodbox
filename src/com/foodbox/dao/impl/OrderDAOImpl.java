package com.flyaway.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.flyaway.dao.OrderDAO;
import com.flyaway.model.Order;

public class OrderDAOImpl implements OrderDAO {
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());

	@Override
	public Order createOrder(Order order) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(order);
		transaction.commit();
		session.close();
		return order;
	}

	@Override
	public List<Order> getAllOrders() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Order> orderList  = session.createQuery("from com.flyaway.model.Order").list();
		transaction.commit();
		session.close();
		return orderList;
		
	}

	@Override
	public void removeOrders(int orderId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
	    Order o = new Order();
		o.setOrderId(orderId);
		session.delete(o);
		transaction.commit();
		session.close();
	}
	

}
