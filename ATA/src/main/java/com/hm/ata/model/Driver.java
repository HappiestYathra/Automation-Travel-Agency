package com.hm.ata.model;
import javax.persistence.*;
@Entity
@Table(name="Driver")
public class Driver {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="driverId")
	String driverID;
	
	@Column(name="name")
	String name;
	
	@Column(name="street")
	String street;
	
	@Column(name="location")
	String location;
	
	@Column(name="city")
	String city;
	
	@Column(name="state")
	String state;
	
	@Column(name="pincode")
	String pincode;
	
	@Column(name="mobileNo")
	String mobileNo;
	
	@Column(name="licenseNumber")
	String licenseNumber;

	public String getDriverID() {
		return driverID;
	}

	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	

}
