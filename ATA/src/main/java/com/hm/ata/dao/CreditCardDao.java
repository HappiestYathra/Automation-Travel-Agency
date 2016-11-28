package com.hm.ata.dao;

import java.util.List;

import com.hm.ata.model.CreditCard;

public interface CreditCardDao {

	public void addCreditCard(CreditCard creditCard);

	public List<CreditCard> listCreditCard();
	
	public CreditCard getCreditCard(String creditCardNumber);
	
	public void deleteCreditCard(CreditCard creditCard);
}
