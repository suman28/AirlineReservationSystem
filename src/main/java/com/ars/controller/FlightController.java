package com.ars.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ars.models.Flight;
import com.ars.models.Reservation;
import com.ars.models.User;
import com.ars.service.FlightService;
import com.ars.service.UserService;

@RestController
@RequestMapping(path = "/api/flights")
@CrossOrigin
public class FlightController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@Autowired
	FlightService flightService;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getFlights(@RequestParam(required = true) String source,
			@RequestParam("destination") String destination, Pageable page) {
		List<Reservation> flights = null;
		try {
			// flights = flightService.getFlights(page);
			flights = flightService.getFlights(page, source, destination);
			return new ResponseEntity<>(flights, HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/*
	 * @RequestMapping(value="/{flightId}", method = RequestMethod.GET, produces =
	 * MediaType.APPLICATION_JSON_VALUE) public ResponseEntity<?>
	 * getFlight(@PathVariable(required = true) Long flightId) { User user = null;
	 * try { user = flightService.getFlight(flightId); return new
	 * ResponseEntity<>(user, HttpStatus.OK); } catch (Exception ex) { return new
	 * ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); } }
	 */

	@RequestMapping(value = "/addFlight", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createUser(@RequestBody Flight flight) {
		Flight flightInfo = null;
		try {
			flightInfo = flightService.addFlight(flight);
			return new ResponseEntity<>(flightInfo, HttpStatus.OK);
		} catch (Exception ex) {
			log.error(ex.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
