package com.hcl.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import AdminDao.ConectionUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hcl.aojo.BusAjo;

public class BusDAO {

	public void setBusDetails(String bName, String arrCity, String deptCity, int seats, Date bDetails) {

		UserDAO us = new UserDAO();
		Session session = us.sessionUtil();

		Date now = new Date();

		BusAjo fs = new BusAjo();
		fs.setArrCity(arrCity);
		fs.setDeptCity(deptCity);
		fs.setbName(bName);
		fs.setSeats(seats);
		fs.setbDetails(bDetails);

		Transaction transaction = session.beginTransaction();
		System.out.println(fs);
		System.out.println("before save of date of Bus");
		session.save(fs);
		session.getTransaction().commit();
		System.out.println("\n\n Details Added of   \n");
		// List<BusAjo> dateAndTimes = (List<BusAjo>) session.createQuery(
		// "from BusAjo").list();
		//
		//
		//
		// System.out.println(Arrays.toString(dateAndTimes.toArray()));
		
		session.close();

	}

	public static List<BusAjo> getAllBuses() {
		List<BusAjo> buslist;
		UserDAO us = new UserDAO();
		Session session = us.sessionUtil();
		session.beginTransaction();
		List<BusAjo> dateAndTimes = (List<BusAjo>) session.createQuery("from BusAjo").list();
		System.out.println(Arrays.toString(dateAndTimes.toArray()));
		session.getTransaction().commit();

		return dateAndTimes;
	}

	public static List<BusAjo> getBusesByNames(String dept,String arr) {
		List<BusAjo> buslist;
		UserDAO us = new UserDAO();
		Session session = us.sessionUtil();
		session.beginTransaction();
		List<BusAjo> dateAndTimes = (List<BusAjo>) session.createQuery("from BusAjo bj where bj.arrCity = :stock and bj.deptCity = :jack ")
		.setParameter("stock",arr).setParameter("jack",dept).list();
		System.out.println(Arrays.toString(dateAndTimes.toArray()));
		session.getTransaction().commit();

		return dateAndTimes;
	}

	public BusAjo getBusById(int id) {
		UserDAO us = new UserDAO();
		Session session = us.sessionUtil();
		session.beginTransaction();
		BusAjo p = (BusAjo) session.get(new BusAjo().getClass(), id);
		session.getTransaction().commit();
		System.out.println("\n<----Bus Details are as follows------>\n\n");
		return p;
	}

	public int updateBusbyId(int id, String bname, String dept, int seat, String acity) {
		UserDAO us = new UserDAO();
		Session session = us.sessionUtil();
		session.beginTransaction();
		BusAjo b = new BusAjo();
		session.load(b, id);
		b.setbName(bname);
		b.setArrCity(acity);
		b.setDeptCity(dept);
		b.setSeats(seat);
//		Date d = new Date("5-Jan-2010,13:00:14 PM");
//		b.setbDetails(d);
		session.update(b);
		
		session.getTransaction().commit();

		return 1;
	}
	
	public boolean deleteBus(int id)
	{
		BusAjo ba=new BusAjo();
		UserDAO us = new UserDAO();
		Session session = us.sessionUtil();
		session.beginTransaction();
		session.load(ba, id);
		session.delete(ba);
		session.getTransaction().commit();
		System.out.println("\n<----Bus Details Deleted------>\n\n");
		return true;
	}

}
