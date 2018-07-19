package com.ars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ars.models.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long>{

	@Query(value = "select * from user_details p where p.flightId = ?1 ", nativeQuery = true)
	Flight findOne(Long flightId);
}