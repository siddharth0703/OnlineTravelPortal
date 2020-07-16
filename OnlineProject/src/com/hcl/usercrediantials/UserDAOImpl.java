package com.hcl.usercrediantials;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import com.hcl.usercrediantials.HibernateUtil;


public class UserDAOImpl implements UserDAO {

	@Override
	public List<DetailsOfUser> showAllUser() {
		
		 List<DetailsOfUser> userList = new ArrayList();
	        Session session = com.hcl.usercrediantials.HibernateUtil.getSession();
	        Query query = session.createQuery("From DetailsOfUser");
	        userList = query.list();
	        return userList;
	}
	
	public static void main(String[] args) {
		
	}

}
