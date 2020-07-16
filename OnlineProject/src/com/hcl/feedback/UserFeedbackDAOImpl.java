package com.hcl.feedback;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

import com.hcl.feedback.HibernateUtil;
public class UserFeedbackDAOImpl implements UserFeedbackDAO {
	@Override
	public void saveUserFeedback(UserFeedbackDetails userfeedbackDetails) {
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(userfeedbackDetails);
		transaction.commit();
		session.close();
	}
	@Override
    public List<UserFeedbackDetails> showAllFeedback() {
        List<UserFeedbackDetails> feedbackList = new ArrayList();
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("From UserFeedbackDetails");
        feedbackList = query.list();
        return feedbackList;
    }
}
