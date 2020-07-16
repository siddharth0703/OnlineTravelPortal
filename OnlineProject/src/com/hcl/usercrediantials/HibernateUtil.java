package com.hcl.usercrediantials;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static Session getSession()
	{
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(DetailsOfUser.class);
		SessionFactory factory = cfg.buildSessionFactory();
		return factory.openSession();
		
	}
}

