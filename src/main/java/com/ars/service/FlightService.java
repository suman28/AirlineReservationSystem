package com.ars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ars.models.Flight;
import com.ars.models.Reservation;
import com.ars.repository.FlightRepository;

@Service
public class FlightService implements IFlightService {
	
	@Autowired
	FlightRepository flightRepository;

	@Override
	public List<Reservation> getFlights(Pageable page, String source, String destination) {
//		return flightRepository.findAll(page);
		return flightRepository.findFlights(source, destination);
	}

	@Override
	public Flight addFlight(Flight flight) {
		return flightRepository.saveAndFlush(flight);
	}

}
