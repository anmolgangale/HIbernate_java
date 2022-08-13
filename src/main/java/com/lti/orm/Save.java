package com.lti.orm;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;



public class Save {

	public static void main(String[] args) {
		
		
		Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx= session.beginTransaction();
		
		
		Employee e1= new Employee();
		e1.setId(103);
		e1.setFirstName("anmol");
		e1.setLastName("Gangale");
		
		session.save(e1);
		tx.commit();
		System.out.println("Record Inserted");
		
		factory.close();
		session.close();
		
		
		
		
		
		
		
	}

}
