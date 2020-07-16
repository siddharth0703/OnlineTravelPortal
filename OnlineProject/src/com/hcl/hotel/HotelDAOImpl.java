package com.hcl.hotel;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.Query;

public class HotelDAOImpl implements HotelDAO{
	@Override
	public void saveHotel(HotelDetails hotelDetails) {
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(hotelDetails);
		transaction.commit();
		session.close();
	}
	@Override
    public List<HotelDetails> showAllHotel() {
        List<HotelDetails> hotelList = new ArrayList();
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("From HotelDetails");
        hotelList = query.list();
        return hotelList;
    }
	
    @Override
    public void deleteHotel(HotelDetails hotelDetails) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(hotelDetails);
        transaction.commit();
        session.close();
    }
}

