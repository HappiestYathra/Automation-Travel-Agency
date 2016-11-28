package com.hm.ata.dao;

import java.util.List;

import com.hm.ata.model.Vehicle;

public interface VehicleDao {

	public void addVehicle(Vehicle vehicle);

	public List<Vehicle> listVehicless();
	
	public Vehicle getVehicle(String vehicleID);
	
	public void deleteVehicle(Vehicle vehicle);
}
