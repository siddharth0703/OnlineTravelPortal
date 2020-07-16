package com.hcl.DAO;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hcl.aojo.BusAjo;
import com.hcl.aojo.Enquiry;
import com.hcl.aojo.FeedbackAjo;
import com.hcl.aojo.FlightAjo;
import com.hcl.aojo.HotelAjo;
import com.hcl.aojo.LoginAojo;
import com.hcl.aojo.PaymentAjo;
import com.hcl.aojo.ReservationAJO;
import com.hcl.beans.User;

public class UserDAO {

	public void addUserDetails(String userName, String password, String email, String phone, String address, String city,
			int zipcode) {
		try {
			Date d = new Date();
			UserDAO ui = new UserDAO();
			LoginAojo u = new LoginAojo();
			u.setUserName(userName);
			u.setCity(city);
			u.setEmail(email);
			u.setPassword1(password);
			u.setPhone(phone);
			u.setAddress(address);
			u.setZipcode(zipcode);

			ReservationAJO reservation1 = new ReservationAJO();
			ReservationAJO reservation2 = new ReservationAJO();

			
			reservation1.setD1(d);
			reservation2.setD1(d);

			Set<ReservationAJO> set = new HashSet<>();
			set.add(reservation1);
			set.add(reservation2);

			System.out.println(set);

			Session session = sessionUtil();
			Transaction transaction = session.beginTransaction();
			session.save(u);
			session.getTransaction().commit();
			session.close();
			System.out
					.println("\n\n Details Added using ONE to Many with User forced to " + "BOOK on servlet signup\n");

		} catch (HibernateException e) {

			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}

	public ReservationAJO setReservation() {
		Date date1 = new Date();
		System.out.println(date1);
		Session session = sessionUtil();
		Transaction transaction = session.beginTransaction();
		ReservationAJO rs = new ReservationAJO(date1);
		System.out.println(rs);
		System.out.println("before save of date");
		session.save(rs);
		session.getTransaction().commit();
		session.close();
		System.out.println("\n\n Details Added of DATE wthour Map  \n");
		return rs;
	}

	public Session sessionUtil() {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(LoginAojo.class)
				.addAnnotatedClass(ReservationAJO.class).addAnnotatedClass(Enquiry.class)
				.addAnnotatedClass(FlightAjo.class).addAnnotatedClass(HotelAjo.class)
				.addAnnotatedClass(FeedbackAjo.class).addAnnotatedClass(BusAjo.class)
				.addAnnotatedClass(PaymentAjo.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session s1 = sessionFactory.openSession();

		return s1;

	}

	public boolean register(LoginAojo bp) {
		Session session=sessionUtil();
		 Transaction tx = session.beginTransaction();
		 Query q = session.createSQLQuery("select * from Customer where Id=?");
		 q.setParameter(0, bp.getId());
		 System.out.println("check-----"+q.executeUpdate());
         if(q.executeUpdate()==1)
         {
        	 return false;
         }
         else
         {
        	 session.save(bp);
        	 tx.commit();
        	 return true;
         }
	
	}

}
