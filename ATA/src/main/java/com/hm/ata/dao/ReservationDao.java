package com.hm.ata.dao;

import java.util.List;

import com.hm.ata.model.Reservation;

public interface ReservationDao {

	public void addReservation(Reservation reservation);

	public List<Reservation> listReservation();
	
	public Reservation getReservation(String reservationID);
	
	public void deleteReservation(Reservation reservation);
}
