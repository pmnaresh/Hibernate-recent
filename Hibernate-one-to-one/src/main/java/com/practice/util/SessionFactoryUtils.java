package com.practice.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.practice.Entity.Applicant;
import com.practice.Entity.Passport;

public class SessionFactoryUtils {
	
	public SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.setProperty(Environment.DRIVER, "oracle.jdbc.OracleDriver");
		configuration.setProperty(Environment.DIALECT, "org.hibernate.dialect.OracleDialect");
		configuration.setProperty(Environment.URL, "jdbc:oracle:thin:@DESKTOP-2GU83B7:1521:XE");
		configuration.setProperty(Environment.USER, "SYSTEM");
		configuration.setProperty(Environment.PASS, "system");
		configuration.setProperty(Environment.HBM2DDL_AUTO, "update");
		configuration.setProperty(Environment.SHOW_SQL, "true");
		configuration.setProperty(Environment.FORMAT_SQL, "true");
		
		configuration.addAnnotatedClass(Passport.class);
		configuration.addAnnotatedClass(Applicant.class);
		

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		
		SessionFactory sf =configuration .buildSessionFactory(serviceRegistry);

		return sf;
	}

}
