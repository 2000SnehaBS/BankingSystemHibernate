package com.sixdee.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="BANKSYSTEM")
public class BankSystem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CUSTOMERID")
	@OneToMany
	private long customerId;
	
	@Column(name="FIRSTNAME")
	private String firstName;
	
	@Column(name="USERNAME")
	private String userName;
	
	@Column(name="LASTNAME")
	private String lastName;
	
	@Column(name="AGE")
	public int age;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="MOBILENUMBER")
	private String mobileNumber;
	
	@Column(name="EMAILID")
	private String emailId;
	
	@Column(name="DATEOFBIRTH")
	private String dateOfBirth;
	
	@Column(name="BALANCE")
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Account [customerId=" + customerId + ", firstName=" + firstName + ", userName=" + userName
				+ ", lastName=" + lastName + ", age=" + age + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}

	

