package com.hcl.flights;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
public class FlightDAOImpl implements FlightDAO {
	@Override
	public void saveFlight(FlightDetails flightDetails) {
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(flightDetails);
		transaction.commit();
		session.close();
	}
	@Override
    public List<FlightDetails> showAllFlight() {
        List<FlightDetails> flightList = new ArrayList();
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("From FlightDetails");
        flightList = query.list();
        return flightList;
    }
    @Override
    public void deleteFlight(FlightDetails flightDetails) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(flightDetails);
        transaction.commit();
        session.close();
    }


}
