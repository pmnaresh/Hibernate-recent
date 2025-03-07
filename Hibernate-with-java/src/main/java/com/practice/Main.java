package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.model.ProductDetails;
import com.practice.util.Util;

public class Main {

	public static void main(String[] args) {
		Util util =new Util();
		
		//getting session Factory object
		SessionFactory sessionFactory = util.getSessionFactory();
		System.out.println(sessionFactory);
		//open session on session factory
		
		Session session = sessionFactory.openSession();
		
		//begin trasaction on session
		Transaction tras =session.beginTransaction();
		
		//saving object
//		session.save(new ProductDetails(12,"mobile",12000f));
		
	ProductDetails pd=	session.find(ProductDetails.class, new Integer(52));
	
	System.out.println(pd);
		
		tras.commit();
		session.close();
		
		

	}

}
