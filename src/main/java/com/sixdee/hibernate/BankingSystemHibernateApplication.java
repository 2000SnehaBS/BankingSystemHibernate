package com.sixdee.hibernate;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sixdee.hibernate.util.SessionFactoryUtil;

@SpringBootApplication
public class BankingSystemHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingSystemHibernateApplication.class, args);
	
	}

}
