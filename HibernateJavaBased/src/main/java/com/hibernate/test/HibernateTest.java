package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.javaconfig.UserDetails;

public class HibernateTest {
	public static void main(String[] args) {
		UserDetails ud1 = new UserDetails(1,"Rohan","8668530410");
		UserDetails ud2 = new UserDetails(2,"Mukesh","9430072224");
		UserDetails ud3 = new UserDetails(3,"Kavita","7991168591");
		UserDetails ud4= new UserDetails(4,"Tanya","635916711");
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(ud1);
		session.save(ud2);
		session.save(ud3);
		session.save(ud4);
		session.getTransaction().commit();
	}
}
