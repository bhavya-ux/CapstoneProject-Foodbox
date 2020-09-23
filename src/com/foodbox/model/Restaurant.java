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
@Table(name= "restaurants")
public class Restaurant {
	

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		public int restaurantId;
	
		private String restaurantName;

		/*@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumn(name = "airlineId")
		private Airline airline;
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumn(name = "routeId")
		private Route route;*/
		
	
		public String getRestaurantName() {
			return restaurantName;
		}
		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
		}
		private String restaurantLocation;
		public String getRestaurantLocation() {
			return restaurantLocation;
		}
		public void setRestaurantLocation(String restaurantLocation) {
			this.restaurantLocation = restaurantLocation;
		}
		
		private String restaurantCuisine;
		public String getRestaurantCuisine() {
			return restaurantCuisine;
		}
		public void setRestaurantCuisine(String restaurantCuisine) {
			this.restaurantCuisine = restaurantCuisine;
		}
		public int getRestaurantId() {
			return restaurantId;
		}
		
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
		
	}
	
		
	}


