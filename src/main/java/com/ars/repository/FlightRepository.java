package com.ars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ars.models.Flight;
import com.ars.models.Reservation;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long>{

	@Query(value = "select * from user_details p where p.flightId = ?1 ", nativeQuery = true)
	Flight findOne(Long flightId);
	
	@Query(value = "select * from reservation_details r where r.source=?1 AND r.destination=?2", nativeQuery=true)
	List<Reservation> findFlights(String source, String destination);
}