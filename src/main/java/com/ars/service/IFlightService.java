package com.ars.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ars.models.Flight;

public interface IFlightService {
	
	Page<Flight> getFlights(Pageable page);
	
	Flight addFlight(Flight flight);
	
}
