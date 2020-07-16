package com.hcl.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.*;

import com.hcl.aojo.Enquiry;
import com.hcl.aojo.HotelAjo;

public class EnquiryDAO {
 public void setEnquiry(){
	 Date d= new Date();
	 UserDAO us = new UserDAO();
		Session session = us.sessionUtil();
		Transaction transaction = session.beginTransaction();
		Enquiry eq= new Enquiry("sidd", d);
		System.out.println(eq);
		System.out.println("before save of date of Enquiry");
		session.save(eq);
		session.getTransaction().commit();
		System.out.println("\n\n Details Added of  Enuiry \n");
		List<HotelAjo> dateAndTimes = (List<HotelAjo>) session.createQuery(
				"from HotelAjo").list();
		System.out.println(Arrays.toString(dateAndTimes.toArray()));
		session.close();
 } 
}
