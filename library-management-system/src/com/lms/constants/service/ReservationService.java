package com.lms.constants.service;

import com.lms.model.BookReservation;

public interface ReservationService {
	
	public BookReservation fetchReservationDetails(String memberId);

}
