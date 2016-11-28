package com.hm.ata.service;

import java.util.ArrayList;

import com.hm.ata.bean.ReservationBean;
import com.hm.ata.bean.RouteBean;
import com.hm.ata.bean.VehicleBean;

public interface Customer {

	ArrayList<VehicleBean> viewVehiclesByType(String vehicleType);
	ArrayList<VehicleBean> viewVehicleBySeats(int noOfSeats);
	ArrayList<RouteBean> viewAllRoutes();
	String bookVehicle(ReservationBean reservationBean);
	boolean cancelBooking(String userID, String reservationID);
	ReservationBean viewBookingDetails(String reservationID);
	ReservationBean printBookingDetails(String reservationID);
	
}
