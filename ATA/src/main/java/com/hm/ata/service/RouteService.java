package com.hm.ata.service;

import java.util.List;

import com.hm.ata.model.Route;

public interface RouteService {
	public void addRoute(Route route);

	public List<Route> listRoute();
	
	public Route getRoute(String routeID);
	
	public void deleteRoute(Route route);

}
