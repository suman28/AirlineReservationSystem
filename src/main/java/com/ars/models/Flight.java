package com.ars.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="flight_details", uniqueConstraints = @UniqueConstraint(columnNames = { "flight_id" }))
public class Flight {

	
	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="flight_id")
	private Long id;
	
	@NotNull
	private String source;
	
	@NotNull
	private String destination;
	private Double fare;

	/**
	 * @return the flightId
	 */
	
	public Long getId() {
		return id;
	}

	/**
	 * @param flightId
	 *            the flightId to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the fare
	 */
	public Double getFare() {
		return fare;
	}

	/**
	 * @param fare
	 *            the fare to set
	 */
	public void setFare(Double fare) {
		this.fare = fare;
	}

}
