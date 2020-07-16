package com.hcl.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hcl.flights.FlightDetails;
import com.hcl.flights.HibernateUtil;


public class SearchService {
	
	public List<FlightDetails> search(String origin, String destination)
	{
		List<FlightDetails> fl = new ArrayList();
		Session session = HibernateUtil.getSession();
        Query query = session.createQuery("From FlightDetails where origin= :origin and destination= :destination");
        query.setString("origin", origin);
        query.setString("destination", destination);
        System.out.println(origin);
        System.out.println(destination);
		fl=query.list();
        return fl;
	}

}

