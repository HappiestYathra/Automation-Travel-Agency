package com.hm.ata.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Reservation")
public class Reservation {
	
	@Column(name="reservationID")
	String reservationID;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userID")
	String userID;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="routeID")
	String routeID;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vehicleID")
	String vehicleID;

	@Column(name="bookingDate")
	Date bookingDate;
	
	@Column(name="journeydate")
	Date journeyDate;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="driverID")
	String driverID;
	
	@Column(name="bookingStatus")
	String bookingStatus;
	
	@Column(name="totalFare")
	double totalFare;
	
	@Column(name="boardingPoint")
	String boardingPoint;
	
	@Column(name="dropPoint")
	String dropPoint;

	public String getReservationID() {
		return reservationID;
	}

	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getRouteID() {
		return routeID;
	}

	public void setRouteID(String routeID) {
		this.routeID = routeID;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getDriverID() {
		return driverID;
	}

	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public String getDropPoint() {
		return dropPoint;
	}

	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}

	
}
