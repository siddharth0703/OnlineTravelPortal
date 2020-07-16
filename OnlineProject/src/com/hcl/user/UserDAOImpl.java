package com.hcl.user;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class UserDAOImpl implements UserDAO {
	@Override
    public List<UserDetails> showAllUser() {
        List<UserDetails> userList = new ArrayList();
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("From UserDetails");
        userList = query.list();
        return userList;
    }
}
