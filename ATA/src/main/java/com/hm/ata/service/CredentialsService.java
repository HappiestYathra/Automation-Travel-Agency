package com.hm.ata.service;

import java.util.List;

import com.hm.ata.model.Credentials;

public interface CredentialsService {

	public void addCredentials(Credentials credentials);

	public List<Credentials> listCredentials();
	
	public Credentials getCredentials(String userID);
	
	public void deleteCredentials(Credentials credentials);
}
