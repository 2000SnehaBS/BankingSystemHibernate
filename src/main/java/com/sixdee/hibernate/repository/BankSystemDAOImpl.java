package com.sixdee.hibernate.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sixdee.hibernate.entity.BankSystem;
import com.sixdee.hibernate.util.SessionFactoryUtil;
@Repository
@Transactional
public class BankSystemDAOImpl implements BankSystemDAO{
    
	@Override
	public BankSystem createcustomerdetails(BankSystem bk) {
		 
		 SessionFactory sessionFactoy = SessionFactoryUtil.getSessionFactoy();
    	 Session openSession = sessionFactoy.openSession();
    	 
    	 Transaction beginTransaction = openSession.beginTransaction();
    	 
    	 
    	 openSession.save(bk); 
    	 beginTransaction.commit();
    	 openSession.close();
    	 return bk;
    	 
	}

	@Override
	public BankSystem getcustomerdetails(long customerId) {
	 SessionFactory sessionFactoy = SessionFactoryUtil.getSessionFactoy();
   	 Session openSession = sessionFactoy.openSession();
   	 Transaction beginTransaction = openSession.beginTransaction();
   	 BankSystem bs =(BankSystem) openSession.get(BankSystem.class, customerId);
		return bs;
	}

	@Override
	public BankSystem updatecustomerbalance(BankSystem customerdetails) {
		SessionFactory sessionFactoy = SessionFactoryUtil.getSessionFactoy();
	   	Session openSession = sessionFactoy.openSession();
	   	Transaction beginTransaction = openSession.beginTransaction();
	   	openSession.update(customerdetails);
	   	beginTransaction.commit();
	   	openSession.close();
		
		return customerdetails ;
	}
	
	@Override
	public BankSystem withdrawmoney(BankSystem customerdetails) {
		SessionFactory sessionFactoy = SessionFactoryUtil.getSessionFactoy();
	   	Session openSession = sessionFactoy.openSession();
	   	Transaction beginTransaction = openSession.beginTransaction();
	   	openSession.update(customerdetails);
	   	beginTransaction.commit();
	   	openSession.close();
		
		return customerdetails ;
	}
	@Override
	public  void closeAccount(BankSystem customer) {
		 SessionFactory sessionFactoy = SessionFactoryUtil.getSessionFactoy();
      	 Session openSession = sessionFactoy.openSession();
      	 
      	 Transaction beginTransaction = openSession.beginTransaction();
      	 
      	 if(customer != null) {
      		 openSession.delete(customer);
      		 beginTransaction.commit();
      		openSession.close();
      	 }
      	 
      	 else {
      		openSession.close();
      		throw  new RuntimeException("Invalid CustomerId");
      		
      	 }
      	
			
		}

}
