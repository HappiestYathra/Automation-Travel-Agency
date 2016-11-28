package com.hm.ata.service;

import java.util.List;

import com.hm.ata.model.Reservation;

public interface ReservationService {
	public void addReservation(Reservation reservation);

	public List<Reservation> listReservation();
	
	public Reservation getReservation(String userID);
	
	public void deleteReservation(Reservation reservation);

}
