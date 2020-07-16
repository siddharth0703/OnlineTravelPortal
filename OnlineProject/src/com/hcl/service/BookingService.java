package com.hcl.service;

import com.hcl.DAO.UserDAO;
import com.hcl.aojo.LoginAojo;


public class BookingService {
	
	public boolean signup(LoginAojo bp)
	{
	UserDAO bd = new UserDAO();
		if(bd.register(bp))
		{
			return true;
		}
		return false;
	}

}
