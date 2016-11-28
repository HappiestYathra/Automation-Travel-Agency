package com.hm.ata.service;

import java.util.List;

import com.hm.ata.dao.CredentialsDao;
import com.hm.ata.model.Credentials;

public class CredentialsServiceImpl implements CredentialsService {

	CredentialsDao credentialsdao;
	@Override
	public void addCredentials(Credentials credentials) {
		// TODO Auto-generated method stub
		credentialsdao.addCredentials(credentials);
		
	}

	@Override
	public List<Credentials> listCredentials() {
		// TODO Auto-generated method stub
		return credentialsdao.listCredentials();
		
	}

	@Override
	public Credentials getCredentials(String userID) {
		// TODO Auto-generated method stub
		return credentialsdao.getCredentials(userID);
	}

	@Override
	public void deleteCredentials(Credentials credentials) {
		// TODO Auto-generated method stub
		credentialsdao.deleteCredentials(credentials);
		
	}

	public void setCredentialsdao(CredentialsDao credentialsdao) {
		this.credentialsdao = credentialsdao;
	}
	

}
