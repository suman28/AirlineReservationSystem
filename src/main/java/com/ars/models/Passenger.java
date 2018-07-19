package com.ars.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "passenger_details", uniqueConstraints = @UniqueConstraint(columnNames = { "passenger_id" }))
public class Passenger {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="passenger_id")
	private Long id;
	
	@NotNull
	private String passengerName;
	
	@NotNull
	private Integer passengerAge;
	
	/**
	 * @return the ticket
	 */
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@NotNull
	@ManyToOne
	@JoinColumn(name = "pnr")
	private Ticket ticket;
	
	
	
	/**
	 * @return the passengerId
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param passengerId the passengerId to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	
}
