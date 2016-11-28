package com.hm.ata.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CreditCard")
public class CreditCard {
	
	@Id
	@Column(name="creditCardNumber")
	private String creditCardNumber;
	
	@Column(name="validFrom")
	private String validFrom;
	
	@Column(name="validTo")
	private String validTo;
	
	@Column(name="creditBalance")
	private double creditBalance;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userID")
	private String userID;

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	public double getCreditBalance() {
		return creditBalance;
	}

	public void setCreditBalance(double creditBalance) {
		this.creditBalance = creditBalance;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

}
