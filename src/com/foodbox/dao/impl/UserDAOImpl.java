package com.flyaway.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.flyaway.dao.UserDAO;
import com.flyaway.model.User;

public class UserDAOImpl implements UserDAO 
{
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());


	@Override
	public User createuser(User user) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		return user;
	}

	@Override
	public boolean checkUser(String userName, String userPassword) {
		Session session = factory.openSession();
		boolean userFound = false;
		//String SQL_QUERY ="from com.model.flyway.Login l where l.userName = :userName and l.userPassword = :userPasword";
		Query query = session.createQuery("from User u where u.userName = ? and u.userPassword = ?");
		query.setParameter(0,userName);
		query.setParameter(1,userPassword);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		session.close();
		return userFound;   		
	}

	@Override
	public List<User> getAllUsers() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<User> userList  = session.createQuery("from com.flyaway.model.User").list();
		transaction.commit();
		session.close();
		return userList;
	}

}
