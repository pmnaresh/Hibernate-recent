package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Entity.Applicant;
import com.practice.Entity.Passport;
import com.practice.util.SessionFactoryUtils;

public class Main {

	public static void main(String[] args) {
		SessionFactoryUtils utils =new SessionFactoryUtils();
		
		SessionFactory sesssioFactory=utils.getSessionFactory();
		
		Session session =sesssioFactory.openSession();
		
		Passport pass = new Passport();
		pass.setPassportIssueLocation("tirupathi");
		
		Applicant applicant = new Applicant();
		applicant.setApplicantNumber(1234);
		applicant.setApplicantName("Naresh");
		applicant.setApplicantAddress("Madanapalli");
		applicant.setApplicantContactNumber(9908692445l);
		applicant.setPassport(pass);
		System.out.println("applicant -->"+applicant);
		Transaction tx =session.beginTransaction();
		session.save(applicant);
		session.save(pass);
		
		tx.commit();
		session.close();
		
		System.out.println("success");

	}

}
