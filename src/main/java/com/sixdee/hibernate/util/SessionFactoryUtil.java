package com.sixdee.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	private static SessionFactory factory = null;
	
	public static  SessionFactory getSessionFactoy() {
		if(factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
			
		}
			return factory;
	}

}
