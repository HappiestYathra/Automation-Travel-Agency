package com.hm.ata.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hm.ata.model.Credentials;


public class CredentialsDaoImpl implements CredentialsDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addCredentials(Credentials credentials) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(credentials);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Credentials> listCredentials() {
		// TODO Auto-generated method stub
		return (List<Credentials>) sessionFactory.getCurrentSession().createCriteria(Credentials.class).list();
	}

	@Override
	public Credentials getCredentials(String userID) {
		// TODO Auto-generated method stub
		return (Credentials) sessionFactory.getCurrentSession().get(Credentials.class, userID);
	}

	@Override
	public void deleteCredentials(Credentials credentials) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Employee WHERE empid = "+credentials.getUserID()).executeUpdate();
	}

	

}
