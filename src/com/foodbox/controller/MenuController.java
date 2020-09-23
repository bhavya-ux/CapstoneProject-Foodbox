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

import org.junit.Test;

import com.flyaway.model.Menu;
import com.flyaway.service.MenuService;
import com.flyaway.service.impl.MenuServiceImpl;



@Path("/menu")
public class MenuController {
	private MenuService service = new MenuServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Menu createMenu(Menu menu) {
		return service.createMenu(menu);
	}

	@GET
	public List<Menu> getAllMenus() {
		return service.getAllMenus();
	}

	@DELETE
	@Path("/{id}")
	public void removeMenu(@PathParam("menuItemId")int menuItemId) {
	service.removeMenu(menuItemId);
		
	}

	@GET
    @Path("/{menuItemName}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Menu> getMenuSearch(@PathParam("menuItemName")String menuItemName) {
		return service.getMenuSearch(menuItemName);
	}
	

}
