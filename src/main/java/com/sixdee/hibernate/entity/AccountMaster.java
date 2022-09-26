package com.sixdee.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNTMASTER")
public class AccountMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ACCOUNT_MASTER_ID")
	private Integer accountMasterId;
	
	@Column(name="ACCOUNT_ID")
	private String accountId;
	
	@Column(name="ACCOUNT_TYPE")
     private String accountType;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CUSTOMERID")
	private BankSystem customerId;

	public Integer getAccountMasterId() {
		return accountMasterId;
	}

	public void setAccountMasterId(Integer accountMasterId) {
		this.accountMasterId = accountMasterId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public BankSystem getCustomerId() {
		return customerId;
	}

	public void setCustomerId(BankSystem customerId) {
		this.customerId = customerId;
	}

	public AccountMaster(Integer accountMasterId, String accountId, String accountType, BankSystem customerId) {
		super();
		this.accountMasterId = accountMasterId;
		this.accountId = accountId;
		this.accountType = accountType;
		this.customerId = customerId;
	}

	public AccountMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AccountMaster [accountMasterId=" + accountMasterId + ", accountId=" + accountId + ", accountType="
				+ accountType + ", customerId=" + customerId + "]";
	}
	
	
    
	
	
	
	
     
	

}
