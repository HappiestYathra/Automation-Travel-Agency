package com.hm.ata.service;

import java.util.List;

import com.hm.ata.model.CreditCard;


public interface CreditCardService {
	public void addCreditCard(CreditCard creditCard);

	public List<CreditCard> listCreditCard();
	
	public CreditCard getCreditCard(String creditCardNumber);
	
	public void deleteCreditCard(CreditCard creditCard);

}
