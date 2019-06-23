package com.hcl.MortageLoan.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MortageLoanCustomer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	private String customerName;
	private int customerAge;
	private String customerGender;
	private String customerMarritalStatus;
	private int customerCreditScore;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public String getCustomerMarritalStatus() {
		return customerMarritalStatus;
	}
	public void setCustomerMarritalStatus(String customerMarritalStatus) {
		this.customerMarritalStatus = customerMarritalStatus;
	}
	public int getCustomerCreditScore() {
		return customerCreditScore;
	}
	public void setCustomerCreditScore(int customerCreditScore) {
		this.customerCreditScore = customerCreditScore;
	}
	public MortageLoanCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MortageLoanCustomer(int customerId, String customerName, int customerAge, String customerGender,
			String customerMarritalStatus, int customerCreditScore) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.customerGender = customerGender;
		this.customerMarritalStatus = customerMarritalStatus;
		this.customerCreditScore = customerCreditScore;
	}
	@Override
	public String toString() {
		return "MortageLoan [customerId=" + customerId + ", customerName=" + customerName + ", customerAge="
				+ customerAge + ", customerGender=" + customerGender + ", customerMarritalStatus="
				+ customerMarritalStatus + ", customerCreditScore=" + customerCreditScore + "]";
	}
	
	
	
	

}
