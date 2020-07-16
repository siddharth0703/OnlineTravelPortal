package com.hcl.DAO;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hcl.aojo.BusAjo;
import com.hcl.aojo.HotelAjo;

public class HotelDAO {

	public void addHotel() {

		UserDAO us = new UserDAO();
		Session session = us.sessionUtil();

		Date now = new Date();
		HotelAjo hd= new HotelAjo("Sheraton", "Delhi", 40000, 100, now, now);
		Transaction transaction = session.beginTransaction();
		System.out.println(hd);
		System.out.println("before save of date of Bus");
		session.save(hd);
		session.getTransaction().commit();
		System.out.println("\n\n Details Added of   \n");
		List<HotelAjo> dateAndTimes = (List<HotelAjo>) session.createQuery("from HotelAjo").list();
		System.out.println(Arrays.toString(dateAndTimes.toArray()));
		session.close();

	}

}
