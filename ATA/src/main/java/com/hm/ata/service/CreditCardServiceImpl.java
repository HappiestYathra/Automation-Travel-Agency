package com.hm.ata.service;

import java.util.List;

import com.hm.ata.dao.CredentialsDao;
import com.hm.ata.dao.CreditCardDao;
import com.hm.ata.model.CreditCard;

public class CreditCardServiceImpl implements CreditCardService {

	CreditCardDao creditCardDao;
	@Override
	public void addCreditCard(CreditCard creditCard) {
		// TODO Auto-generated method stub
		
		creditCardDao.addCreditCard(creditCard);
	}

	@Override
	public List<CreditCard> listCreditCard() {
		// TODO Auto-generated method stub
		return creditCardDao.listCreditCard();
	}

	@Override
	public CreditCard getCreditCard(String creditCardNumber) {
		// TODO Auto-generated method stub
		return creditCardDao.getCreditCard(creditCardNumber);
	}

	@Override
	public void deleteCreditCard(CreditCard creditCard) {
		// TODO Auto-generated method stub
		creditCardDao.deleteCreditCard(creditCard);
	}

}
