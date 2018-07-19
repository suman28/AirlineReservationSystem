package com.ars.models;

import java.util.Date;

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
@Table(name = "ticket_details", uniqueConstraints = @UniqueConstraint(columnNames = { "pnr" }))
public class Ticket {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pnr")
	private Long id;
	
	@NotNull
	private Date bookingDate;
	
	@NotNull
	private Date departureDate;
	
	@NotNull
	private Date departureTime;
	
	@NotNull
	private Long totalFare;
	
	@NotNull
	@ManyToOne
    @JoinColumn(name = "flight_id")
	private Flight flight;
	
	@NotNull
	@ManyToOne
    @JoinColumn(name = "username")
	private User user;

	/**
	 * @return the flight
	 */
	public Flight getFlight() {
		return flight;
	}

	/**
	 * @param flight the flight to set
	 */
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the pnr
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param pnr the pnr to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the bookingDate
	 */
	public Date getBookingDate() {
		return bookingDate;
	}

	/**
	 * @param bookingDate the bookingDate to set
	 */
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	/**
	 * @return the departureDate
	 */
	public Date getDepartureDate() {
		return departureDate;
	}

	/**
	 * @param departureDate the departureDate to set
	 */
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 * @return the departureTime
	 */
	public Date getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return the totalFare
	 */
	public Long getTotalFare() {
		return totalFare;
	}

	/**
	 * @param totalFare the totalFare to set
	 */
	public void setTotalFare(Long totalFare) {
		this.totalFare = totalFare;
	}
	
	//TODO -- flightId, username has to be added
	
}
