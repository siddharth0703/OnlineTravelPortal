package com.hcl.DAO;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.hcl.DAO.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hcl.aojo.FlightAjo;

public class FlightDAO {

	public void addFlightDetails() {
		Date now = new Date();

		FlightAjo fs = new FlightAjo();
		fs.setArrCity("Gurgaon");
		fs.setDeptCity("London");
		fs.setfName("Indigo");
		fs.setSeats(23);
		fs.setfDetails(now);
		
		UserDAO us = new UserDAO();
		Session session = us.sessionUtil();
		Transaction transaction = session.beginTransaction();
		System.out.println(fs);
		System.out.println("before save of date of fLIGHT");
		session.save(fs);
		session.getTransaction().commit();
		
		System.out.println("\n\n Details Added of Flight  \n");
		
        List<FlightAjo> dateAndTimes = (List<FlightAjo>)session.createQuery("from FlightAjo").list();
        System.out.println(Arrays.toString(dateAndTimes.toArray()));
        session.close();
	}

}
