package com.hm.ata.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle")
public class Vehicle {

	@Id
	@Column(name="vehicleID")
	String vehicleID;
	
	@Column(name="name")
	String name;
	
	@Column(name="type")
	String type;
	
	@Column(name="registrationNumber")
	String registrationNumber;
	
	@Column(name="seatingCapacity")
	int seatingCapacity;
	
	@Column(name="farePerKM")
	double farePerKM;

	public String getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public double getFarePerKM() {
		return farePerKM;
	}

	public void setFarePerKM(double farePerKM) {
		this.farePerKM = farePerKM;
	}
	
}
