package com.hm.ata.service;

import java.util.List;

import com.hm.ata.model.Profile;

public interface ProfileService {
	public void addProfile(Profile profile);

	public List<Profile> listProfile();
	
	public Profile getProfile(String userID);
	
	public void deleteProfile(Profile profile);

}
