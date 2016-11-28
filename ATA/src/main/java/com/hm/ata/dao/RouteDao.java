package com.hm.ata.dao;

import java.util.List;

import com.hm.ata.model.Route;

public interface RouteDao {

	public void addRoute(Route route);

	public List<Route> listRoutess();
	
	public Route getRoute(String routeID);
	
	public void deleteRoute(Route route);
}
