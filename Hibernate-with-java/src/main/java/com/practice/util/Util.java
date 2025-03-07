package com.practice.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.practice.model.ProductDetails;

public class Util {

	public SessionFactory getSessionFactory() {

		//loading properties by using Properties object
		
		
//		Properties properties = new Properties();
//		properties.put(Environment.DRIVER, "oracle.jdbc.OracleDriver");
//		properties.put(Environment.DIALECT, "org.hibernate.dialect.OracleDialect");
//		properties.put(Environment.URL, "jdbc:oracle:thin:@DESKTOP-2GU83B7:1521:XE");
//		properties.put(Environment.USER, "SYSTEM");
//		properties.put(Environment.PASS, "system");
//		properties.put(Environment.HBM2DDL_AUTO, "create");
//		properties.put(Environment.SHOW_SQL, true);
//		properties.put(Environment.FORMAT_SQL, true);
//		Configuration configuration = new Configuration();
//		configuration.setProperties(properties);
//		configuration.addAnnotatedClass(ProductDetails.class);
		
		//loading properties to configuration object directly
		
		Configuration configuration = new Configuration();
		configuration.setProperty(Environment.DRIVER, "oracle.jdbc.OracleDriver");
		configuration.setProperty(Environment.DIALECT, "org.hibernate.dialect.OracleDialect");
		configuration.setProperty(Environment.URL, "jdbc:oracle:thin:@DESKTOP-2GU83B7:1521:XE");
		configuration.setProperty(Environment.USER, "SYSTEM");
		configuration.setProperty(Environment.PASS, "system");
		configuration.setProperty(Environment.HBM2DDL_AUTO, "update");
		configuration.setProperty(Environment.SHOW_SQL, "true");
		configuration.setProperty(Environment.FORMAT_SQL, "true");
		
		configuration.addAnnotatedClass(ProductDetails.class);
		

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		
		SessionFactory sf =configuration .buildSessionFactory(serviceRegistry);

		return sf;
	}
	
	

}
