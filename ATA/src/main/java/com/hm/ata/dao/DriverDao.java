package com.hm.ata.dao;

import java.util.List;

import com.hm.ata.model.Driver;

public interface DriverDao {

	public void addDriver(Driver driver);

	public List<Driver> listDriver();
	
	public Driver getDriver(String driverID);
	
	public void deleteDriver(Driver driver);
}
