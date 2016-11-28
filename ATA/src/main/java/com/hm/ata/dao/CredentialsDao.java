package com.hm.ata.dao;

import java.util.List;

import com.hm.ata.model.Credentials;

public interface CredentialsDao {

	public void addCredentials(Credentials credentials);

	public List<Credentials> listCredentials();
	
	public Credentials getCredentials(String userID);
	
	public void deleteCredentials(Credentials credentials);
}
