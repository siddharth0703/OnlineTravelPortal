package com.hcl.DAO;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hcl.DAO.*;
import com.hcl.aojo.BusAjo;
import com.hcl.aojo.FeedbackAjo;

public class FeedbackDAO {
	public void setFeedback() {
		UserDAO us = new UserDAO();
		Session session = us.sessionUtil();
		Transaction transaction = session.beginTransaction();
		FeedbackAjo fd= new FeedbackAjo("asidasibdan");
		System.out.println(fd);
		System.out.println("before save of date of Feedback");
		session.save(fd);
		session.getTransaction().commit();
		System.out.println("\n\n Details Added of Feedback  \n");
		List<FeedbackAjo> dateAndTimes = (List<FeedbackAjo>) session.createQuery(
				"from FeedbackAjo").list();
		System.out.println(Arrays.toString(dateAndTimes.toArray()));
		session.close();

		
		
	}
}
