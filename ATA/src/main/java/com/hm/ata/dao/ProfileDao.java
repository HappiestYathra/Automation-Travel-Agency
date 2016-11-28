package com.hm.ata.dao;

import java.util.List;

import com.hm.ata.model.Profile;

public interface ProfileDao {

	public void addProfile(Profile profile);

	public List<Profile> listProfile();
	
	public Profile getProfile(String userID);
	
	public void deleteProfile(Profile profile);
}
