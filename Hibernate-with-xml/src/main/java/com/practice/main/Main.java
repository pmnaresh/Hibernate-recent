package com.practice.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.model.Product;

public class Main {

	
	public static void main(String[] args) {
		
		//creating session factory
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		System.out.println("sessionFactory-->"+sessionFactory);
		
		//creating session 
		Session session= sessionFactory.openSession();
		System.out.println("session -->"+session);
		
		//begining the transaction 
		Transaction trans=session.beginTransaction();
		System.out.println("transaction-->"+trans);
		
		//save
		session.save(new Product(1, "poco", 12000f,2));
		
		//commit
		trans.commit();
		
		//close the session
		session.close();
		
		System.out.println("success");
	}

}
