package com.hcl.bikes;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
public class BikeDAOImpl implements BikeDAO {
	@Override
	public void saveBike(BikeDetails bikeDetails){
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(bikeDetails);
		transaction.commit();
		session.close();
	}
	@Override
	public List<BikeDetails> showAllBike() {
		List<BikeDetails> bikeList = new ArrayList();
		Session session = HibernateUtil.getSession();
		Query query = session.createQuery("From BikeDetails");
		bikeList = query.list();
		return bikeList;
	}
	@Override
	public void deleteBike(BikeDetails bikeDetails) {
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.delete(bikeDetails);
		transaction.commit();
		session.close();
	}


}
