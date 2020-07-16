package com.hcl.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hcl.hotel.HibernateUtil;
import com.hcl.hotel.HotelDetails;


public class HotelViewService {
	public List<HotelDetails> findHotel(String hotelCity)
	{
		List<HotelDetails> hotelList = new ArrayList();
		Session session = HibernateUtil.getSession();
        Query query = session.createQuery("From HotelDetails where hotelCity= :hotelCity");
        query.setString("hotelCity", hotelCity);
        hotelList=query.list();
        return hotelList;


	}
}
