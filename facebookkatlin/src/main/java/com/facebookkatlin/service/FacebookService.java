package com.facebookkatlin.service;

import com.facebookkatlin.dao.FacebookDAO;
import com.facebookkatlin.dao.FacebookDAOInterface;
import com.facebookkatlin.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface {

	public int createProfileService(FacebookUser fu) {
		FacebookDAOInterface fd=new FacebookDAO();
		return fd.createProifleDAO(fu);
	}

}
