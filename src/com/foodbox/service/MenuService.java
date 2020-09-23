package com.flyaway.service;

import java.util.List;

import com.flyaway.model.Menu;


public interface MenuService {
	public Menu createMenu(Menu menu);
	public List<Menu> getAllMenus();
	public void removeMenu(int menuItemId);
	public List<Menu> getMenuSearch(String menuItemName) ;

}
