package com.flyaway.service.impl;

import java.util.List;

import org.junit.Test;

import com.flyaway.dao.MenuDAO;
import com.flyaway.dao.impl.MenuDAOImpl;
import com.flyaway.model.Menu;
import com.flyaway.service.MenuService;

public class MenuServiceImpl implements MenuService {
	private MenuDAO dao = new MenuDAOImpl();

	@Override
	public Menu createMenu(Menu menu) {
		return dao.createMenu(menu);
	}

	@Override
	public List<Menu> getAllMenus() {
		return dao.getAllMenus();
	}

	@Override
	public void removeMenu(int menuItemId) {
	dao.removeMenu(menuItemId);
		
	}
	@Override
	public List<Menu> getMenuSearch(String menuItemName) {
		return dao.getMenuSearch(menuItemName);
	}
	
	

}
