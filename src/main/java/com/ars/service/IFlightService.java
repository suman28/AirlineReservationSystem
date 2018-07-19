package com.ars.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ars.models.Flight;
import com.ars.models.Reservation;

public interface IFlightService {
	
//	Page<Flight> getFlights(Pageable page);
	
	Flight addFlight(Flight flight);

	List<Reservation> getFlights(Pageable page, String source, String destination);
	
}
