package com.flyaway.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.flyaway.dao.RestaurantDAO;
import com.flyaway.model.Restaurant;

public class RestaurantDAOImpl implements RestaurantDAO {
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());
	@Override
	public Restaurant createrestaurant(Restaurant restaurant) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(restaurant);
		transaction.commit();
		session.close();
		return restaurant;
	}
	@Override
	public Restaurant getRestaurantById(int restaurantId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Restaurant restaurant = (Restaurant)session.get(Restaurant.class,restaurantId);
		transaction.commit();
		session.close();
		return restaurant;
	}
	@Override
	public List<Restaurant> getAllRestaurants() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Restaurant> restaurantList = session.createQuery("from com.flyaway.model.Restaurant").list();
		transaction.commit();
		session.close();
		return restaurantList;
	}
	
	@Override
	public List<Restaurant> getRestaurantSearch(String restaurantLocation) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();	
		Query q=session.createQuery("select r.restaurantId, r.restaurantName, r.restaurantCuisine from com.flyaway.model.Restaurant r where r.restaurantLocation=:restaurantLocation");
		q.setParameter("restaurantLocation", restaurantLocation);
		List<Restaurant> restaurantList=q.list();
		
			
			transaction.commit();
			session.close();
			return restaurantList;
	}
	@Override
	public void removeRestaurant(int restaurantId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Restaurant r = new Restaurant();
		r.setRestaurantId(restaurantId);
		session.delete(r);
		transaction.commit();
		session.close();
		
	}


}
