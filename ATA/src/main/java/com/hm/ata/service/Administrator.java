package com.hm.ata.service;

import java.util.ArrayList;
import java.util.Date;

import com.hm.ata.bean.DriverBean;
import com.hm.ata.bean.ReservationBean;
import com.hm.ata.bean.RouteBean;
import com.hm.ata.bean.VehicleBean;

public interface Administrator {
  
	String addVehicle(VehicleBean vehicleBean);
	int deleteVehicle(ArrayList<String> vehicleID);
	VehicleBean viewVehicle(String vehicleID);
	boolean modifyVehicle(VehicleBean vehicleBean);
	String addDriver(DriverBean driverbean);
	int deleteDriver(ArrayList<String> driverID);
	boolean allotDriver(String reservationID,String driverID);
	boolean modifyDriver(DriverBean driverBean);
	String addRoute(RouteBean routeBean);
	int deleteRoute(ArrayList<String> routeID);
	RouteBean viewRoute(String routeID);
	boolean modifyRoute(RouteBean routeBean);
	ArrayList<ReservationBean> viewBookingDetails(Date journeyDate,String source, String destination);
}
