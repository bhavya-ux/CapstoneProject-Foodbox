package com.flyaway.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.flyaway.dao.MenuDAO;
import com.flyaway.model.Menu;

public class MenuDAOImpl implements MenuDAO{
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());

	@Override
	public Menu createMenu(Menu menu) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(menu);
		transaction.commit();
		session.close();
		return menu;
	}

	@Override
	public List<Menu> getAllMenus() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Menu> menuList  = session.createQuery("from com.flyaway.model.Menu").list();
		transaction.commit();
		session.close();
		return menuList;
	}

	@Override
	public void removeMenu(int menuItemId) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Menu m = new Menu();
		m.setMenuItemId(menuItemId);
		session.delete(m);
		transaction.commit();
		session.close();	
		}

	@Override
	public List<Menu> getMenuSearch(String menuItemName) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();	
		Query q=session.createQuery("select m.menuItemId,m.menuItemName,m.menuItemPrice from com.flyaway.model.Menu m where m.menuItemName=:menuItemName");
		q.setParameter("menuItemName", menuItemName);
		List<Menu> menuList=q.list();
		
			
			transaction.commit();
			session.close();
			return menuList;
	}

	

}
