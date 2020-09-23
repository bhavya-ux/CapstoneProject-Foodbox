package com.flyaway.dao;

import java.util.List;

import com.flyaway.model.Menu;


public interface MenuDAO {
	public Menu createMenu(Menu menu);
	public List<Menu> getAllMenus();
	public void removeMenu(int menuItemId);
	public List<Menu> getMenuSearch(String menuItemName) ;
}
