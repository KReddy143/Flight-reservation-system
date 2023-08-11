package com.psa.checkin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.psa.checkin.integration.dto.Reservation;
import com.psa.checkin.integration.dto.ReservationUpdateRequest;


@Component
public class ReservationRestfullClientimpl implements ReservationRestfullClient {

	@Override
	public Reservation findReservation(Long id) {

		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flightapps/reservation/"+id, Reservation.class);
		return reservation;
	}

	

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/flightapps/reservation/", request ,Reservation.class);
		
		return reservation;
		
	}




}
