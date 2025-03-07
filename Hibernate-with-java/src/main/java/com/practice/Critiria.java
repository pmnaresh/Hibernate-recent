package com.practice;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.practice.model.ProductDetails;
import com.practice.util.Util;

public class Critiria {

	public static void main(String[] args) {
		Util util = new Util();

		// getting session Factory object
		SessionFactory sessionFactory = util.getSessionFactory();
		System.out.println(sessionFactory);

		// open session on session factory
		Session session = sessionFactory.openSession();
		System.out.println(session);

		// creating critiria
		Criteria criteria = session.createCriteria(ProductDetails.class);

		// to fetch all records from table
		List list = criteria.list();
		for (Object obj : list) {
			System.out.println("product obj are -->" + obj);
		}

		System.out.println("************");
		
		// adding restictions
		criteria.add(Restrictions.ge("pPrice", 30f));
		criteria.add(Restrictions.ilike("pName", "tv"));

		List list1 = criteria.list();
		for (Object obj : list1) {
			System.out.println("product obj after adding restictions -->" + obj);
		}

		System.out.println("**************");
		
		// adding criterion
		Criterion priceCriterion = Restrictions.ge("pPrice", 30f);
		Criterion nameCriterion = Restrictions.ilike("pName", "tv");

		criteria.add(nameCriterion);
		criteria.add(priceCriterion);
		List list2 = criteria.list();
		for (Object obj : list2) {
			System.out.println("product obj after adding criterion -->" + obj);
		}

		// page nation
		criteria.setFirstResult(1);
		criteria.setMaxResults(3);
		List list5 = criteria.list();
		for (Object obj : list5) {
			System.out.println("product obj after adding pagination -->" + obj);
		}

	}

}
