package com.flyaway.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "menus")
public class Menu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int menuItemId;
	private String menuItemName;
	private String menuItemPrice;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "restaurantId")
	private Restaurant restaurant;
	public int getMenuItemId() {
		return menuItemId;
	}
	public void setMenuItemId(int menuItemId) {
		this.menuItemId = menuItemId;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public String getMenuItemName() {
		return menuItemName;
	}
	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}
	public String getMenuItemPrice() {
		return menuItemPrice;
	}
	public void setMenuItemPrice(String menuItemPrice) {
		this.menuItemPrice = menuItemPrice;
	}

}
