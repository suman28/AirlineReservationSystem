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
@Table(name = "cc_details", uniqueConstraints = @UniqueConstraint(columnNames = { "card_num" }))
public class CreditCard {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="card_num")
	private Long id;
	
	@NotNull
	private String cardHolderName;
	
	@NotNull
	private Integer cvv;
	
	@NotNull
	private Integer aPin;
	
	@NotNull
	private Integer expiryMonth;
	
	@NotNull
	private Integer expiryYear;
	
	@NotNull
	private Long totalBill;

	/**
	 * @return the cardNumber
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the cardHolderName
	 */
	public String getCardHolderName() {
		return cardHolderName;
	}

	/**
	 * @param cardHolderName the cardHolderName to set
	 */
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	/**
	 * @return the cvv
	 */
	public Integer getCvv() {
		return cvv;
	}

	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	/**
	 * @return the aPin
	 */
	public Integer getaPin() {
		return aPin;
	}

	/**
	 * @param aPin the aPin to set
	 */
	public void setaPin(Integer aPin) {
		this.aPin = aPin;
	}

	/**
	 * @return the expiryMonth
	 */
	public Integer getExpiryMonth() {
		return expiryMonth;
	}

	/**
	 * @param expiryMonth the expiryMonth to set
	 */
	public void setExpiryMonth(Integer expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	/**
	 * @return the expiryYear
	 */
	public Integer getExpiryYear() {
		return expiryYear;
	}

	/**
	 * @param expiryYear the expiryYear to set
	 */
	public void setExpiryYear(Integer expiryYear) {
		this.expiryYear = expiryYear;
	}

	/**
	 * @return the totalBill
	 */
	public Long getTotalBill() {
		return totalBill;
	}

	/**
	 * @param totalBill the totalBill to set
	 */
	public void setTotalBill(Long totalBill) {
		this.totalBill = totalBill;
	}
	
	
	

}
