package com.hm.ata.service;

import java.util.List;

import com.hm.ata.model.Vehicle;

public interface VehicleService {
	public void addVehicle(Vehicle vehicle);

	public List<Vehicle> listVehicle();
	
	public Vehicle getVehicle(String vehicleID);
	
	public void deleteVehicle(Vehicle vehicle);

}
