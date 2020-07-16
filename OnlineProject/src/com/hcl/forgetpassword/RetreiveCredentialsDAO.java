package com.hcl.forgetpassword;

import org.hibernate.cfg.Configuration;

import com.hcl.aojo.LoginAojo;

import org.hibernate.SessionFactory;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RetreiveCredentialsDAO {
	
	public LoginAojo retrieveCredentials(String emailId) {
		
		SessionFactory factory=new Configuration()
				               .configure("hibernate.cfg.xml")
				               .addAnnotatedClass(LoginAojo.class).buildSessionFactory();
		
		
		Session session=factory.openSession();
		List<LoginAojo> list=null;
		
		try
		{System.out.println("Transactiomn Start");
			Transaction tx=session.beginTransaction();
			 System.out.println(emailId);
		 list = (List<LoginAojo>)session.createQuery("from LoginAojo cu where cu.email = :email")
				 .setParameter("email", emailId).list();
		 	System.out.println(list);
			
		LoginAojo myUser=list.get(0);
			
			
			tx.commit();
			
			return myUser;
		}
		finally
		{
			factory.close();
		}
		
	}

}
