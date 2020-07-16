package com.hcl.forgetpassword;

import com.hcl.aojo.LoginAojo;

public class ForgetService {

	public boolean authenticate(String emailId) {
		
		LoginAojo user=new RetreiveCredentialsDAO().retrieveCredentials(emailId);
		System.out.print(user);
		String x=user.getEmail();
		System.out.println("Retrietved email"+x);
		System.out.println("passed email"+emailId);
		if ((user!=null) && (emailId).equals(x))
		{
			System.out.println("Inside true");
			return true;
		}
		  return false;
		
	}
	
	//public UserDetails getUserDetails(String emailId)
	//{
	//return new RetreiveCredentialsDAO().retrieveCredentials("emailId");
	//}
		
}