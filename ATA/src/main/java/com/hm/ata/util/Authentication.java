package com.hm.ata.util;

import com.hm.ata.bean.CredentialsBean;

public interface Authentication {

	boolean authenticate(CredentialsBean credentialsBean);

	String authorize(String userID);

	boolean changeLoginStatus(CredentialsBean credentialsBean, int loginStatus);
}
