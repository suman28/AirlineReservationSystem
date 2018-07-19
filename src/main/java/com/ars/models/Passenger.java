package com.ars.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "passenger_details", uniqueConstraints = @UniqueConstraint(columnNames = { "passengerId" }))
public class Passenger {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long passengerId;
	
	@NotNull
	private String passengerName;
	
	@NotNull
	private Integer passengerAge;
	
	/**
	 * @return the passengerId
	 */
	public Long getPassengerId() {
		return passengerId;
	}

	/**
	 * @param passengerId the passengerId to set
	 */
	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}

	/**
	 * @return the passengerName
	 */
	public String getPassengerName() {
		return passengerName;
	}

	/**
	 * @param passengerName the passengerName to set
	 */
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	/**
	 * @return the passengerAge
	 */
	public Integer getPassengerAge() {
		return passengerAge;
	}

	/**
	 * @param passengerAge the passengerAge to set
	 */
	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}

	/**
	 * @return the passengerGender
	 */
	public String getPassengerGender() {
		return passengerGender;
	}

	/**
	 * @param passengerGender the passengerGender to set
	 */
	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}

	@NotNull
	private String passengerGender;
	
	//TODO
	//Add PNR
	
	
}
