package com.psa.checkin.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.psa.checkin.integration.dto.Reservation;
import com.psa.checkin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestfullClient {
	
	public Reservation findReservation(Long id);
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);

}
