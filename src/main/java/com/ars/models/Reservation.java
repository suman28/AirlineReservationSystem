package com.ars.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "reservation_details", uniqueConstraints = @UniqueConstraint(columnNames = { "id" }))
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

	/**
	 * @return the flight
	 */
	public Flight getFlight() {
		return flight;
	}

	/**
	 * @param flight
	 *            the flight to set
	 */
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@NotNull
	private String destination;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "flight_id")
	private Flight flight;

	@NotNull
	private Integer available_seats;

	/**
	 * @return the available_seats
	 */
	public Integer getAvailable_seats() {
		return available_seats;
	}

	/**
	 * @return the departure_date
	 */
	public Date getDeparture_date() {
		return departure_date;
	}

	/**
	 * @return the departure_time
	 */
	public Date getDeparture_time() {
		return departure_time;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param available_seats
	 *            the available_seats to set
	 */
	public void setAvailable_seats(Integer available_seats) {
		this.available_seats = available_seats;
	}

	/**
	 * @param departure_date
	 *            the departure_date to set
	 */
	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}

	/**
	 * @param departure_time
	 *            the departure_time to set
	 */
	public void setDeparture_time(Date departure_time) {
		this.departure_time = departure_time;
	}

	/**
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

}
