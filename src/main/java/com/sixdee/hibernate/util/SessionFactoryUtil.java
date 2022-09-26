package com.sixdee.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import org.hibernate.service.ServiceRegistry;

public class SessionFactoryUtil {
	/*private static SessionFactory factory = null;
	
	public static  SessionFactory getSessionFactoy() {
		if(factory == null) {
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			
		}
			return factory;
	}*/
	
private static SessionFactory sessionFactory;
	
private static SessionFactory buildSessionFactory() {
    try {
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	System.out.println("Hibernate Configuration loaded");
    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
    	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
    catch (Throwable ex) {
    	System.err.println("Initial SessionFactory creation failed." + ex); 
    	}
	return sessionFactory;
}

public static SessionFactory getSessionFactory() {
	if(sessionFactory == null) sessionFactory = buildSessionFactory();
    return sessionFactory;
}
}
