package com.sixdee.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.sixdee.hibernate.dto.BankSystemDto;
import com.sixdee.hibernate.dto.Deposit;
import com.sixdee.hibernate.dto.Withdraw;
import com.sixdee.hibernate.entity.BankSystem;
import com.sixdee.hibernate.service.BankSystemService;

@RestController
public class BankSystemController {
    @Autowired
    private BankSystemService banksystem;
    @PostMapping("/createcustomerdetails")
	public BankSystem customerdetails(@RequestBody BankSystemDto bs) {
		BankSystem bk = banksystem.customerdetails(bs);
		return bk;
	}
    @PutMapping("/depositemoney")
	public BankSystem depositmoney(@RequestBody Deposit bs) {
		BankSystem bk = banksystem.deposit(bs);
		return bk;
	}
    
    @PutMapping("/withdrawmoney")
   	public BankSystem withdraw(@RequestBody Withdraw bs) {
   		BankSystem bk = banksystem.withdraw(bs);
   		return bk;
   	}
    
    @DeleteMapping("/closeaccount/{customerId}")
   	public String  closeaccount(@PathVariable long customerId ) {
    	
   	return banksystem.closeaccount(customerId);
   		
   	}
}
