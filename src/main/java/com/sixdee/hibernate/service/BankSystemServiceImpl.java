package com.sixdee.hibernate.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixdee.hibernate.dto.BankSystemDto;
import com.sixdee.hibernate.dto.Deposit;
import com.sixdee.hibernate.dto.Withdraw;
import com.sixdee.hibernate.entity.BankSystem;
import com.sixdee.hibernate.repository.BankSystemDAO;
@Service
public class BankSystemServiceImpl implements BankSystemService {
    @Autowired
    private BankSystemDAO dao;
	@Override
	public BankSystem customerdetails(BankSystemDto bs) {
	BankSystem bk = new BankSystem();
	System.out.println("..........."+ bs.toString());
	BeanUtils.copyProperties(bs, bk);
	System.out.println("..........."+ bk.toString());
	return dao.createcustomerdetails(bk);
		
	}
	@Override
	public BankSystem deposit(Deposit bs) {
		BankSystem customerdetails = dao.getcustomerdetails(bs.getCustomerId());
		if( customerdetails != null) {
   		 int currentbalance =  customerdetails.getBalance();
   		 
   		 currentbalance = currentbalance + bs.getDepositamount();
   		 customerdetails.setBalance(currentbalance);
   		 dao.updatecustomerbalance(customerdetails);
   		  
   	 }
   	 else {
   		 throw  new RuntimeException("Invalid CustomerId");
   	 }
   	 
		return customerdetails;
	}
	
	
	@Override
	public BankSystem withdraw(Withdraw bs) {
		BankSystem customerdetails = dao.getcustomerdetails(bs.getCustomerId());
		if( customerdetails != null) {
   		 int currentbalance =  customerdetails.getBalance();
   		 if(currentbalance>bs.getWithdrawamount()) {
   			 currentbalance = currentbalance - bs.getWithdrawamount();
   	   		 customerdetails.setBalance(currentbalance);
   	   		 dao.updatecustomerbalance(customerdetails);
   			 
   		 }
   		 else {
   			throw  new RuntimeException("Insufficient balance");
   		 }
   		
   		  
   	 }
   	 else {
   		 throw  new RuntimeException("Invalid CustomerId");
   	 }
   	 
		return customerdetails;
	}
	@Override
	public String closeaccount(long customerId) {
		String msg = "";
		BankSystem customerdetails = dao.getcustomerdetails(customerId);
		if(customerdetails != null) {
			dao.closeAccount(customerdetails);
			msg = "account deleted successfully";
		}
		else {
			msg = "account not found";
		}
		return msg;
		
		
	}
	

}
