package com.ars.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="reservation_details", uniqueConstraints = @UniqueConstraint(columnNames = { "id" }))
public class Reservation {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@NotNull
	private Date departure_date;

	@NotNull
	private Date departure_time;

	@NotNull
	private String source;

	@NotNull
	private String destination;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the departure_date
	 */
	public Date getDeparture_date() {
		return departure_date;
	}

	/**
	 * @param departure_date
	 *            the departure_date to set
	 */
	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}

	/**
	 * @return the departure_time
	 */
	public Date getDeparture_time() {
		return departure_time;
	}

	/**
	 * @param departure_time
	 *            the departure_time to set
	 */
	public void setDeparture_time(Date departure_time) {
		this.departure_time = departure_time;
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
	 * @return the available_seats
	 */
	public Integer getAvailable_seats() {
		return available_seats;
	}

	/**
	 * @param available_seats
	 *            the available_seats to set
	 */
	public void setAvailable_seats(Integer available_seats) {
		this.available_seats = available_seats;
	}

	/**
	 * @return the flightId
	 */
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "flightId")
//	public Flight getFlightId() {
//		return flightId;
//	}

	/**
	 * @param flightId
	 *            the flightId to set
	 */
//	public void setFlightId(Flight flightId) {
//		this.flightId = flightId;
//	}

	@NotNull
	private Integer available_seats;

//	@NotNull
//
//	private Flight flightId;

}
