package com.ars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ars.models.Flight;
import com.ars.repository.FlightRepository;

@Service
public class FlightService implements IFlightService {
	
	@Autowired
	FlightRepository flightRepository;

	public Page<Flight> getFlights(Pageable page) {
		return flightRepository.findAll(page);
	}

}
