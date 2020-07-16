package com.hcl.DAO;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hcl.aojo.BusAjo;
import com.hcl.aojo.PaymentAjo;

public class PaymentDAO {

 public boolean checkPayment() {
		UserDAO us = new UserDAO();
		Session session = us.sessionUtil();

		Date now = new Date();
		PaymentAjo pj= new PaymentAjo(2300, now, "MASTRO");
		Transaction transaction = session.beginTransaction();
		System.out.println(pj);
		System.out.println("before save of Payment");
		session.save(pj);
		session.getTransaction().commit();
		System.out.println("\n\n Details Added of   \n");
		List<PaymentAjo> dateAndTimes = (List<PaymentAjo>) session.createQuery(
				"from PaymentAjo").list();
		System.out.println(Arrays.toString(dateAndTimes.toArray()));
		session.close();
		return true;
	}

}
