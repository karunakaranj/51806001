package com.hcl.MortageLoan.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class LoanDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int LoanAccountNumber;
	private String security;
	private String address;
	private String loanStatus;
	private long loanAmount;
	private int approvedManagerId;
	
	@OneToOne
	@JoinColumn(name = "customerId")
	private MortageLoanCustomer mortageLoanCustomer; 
	
	public int getLoanAccountNumber() {
		return LoanAccountNumber;
	}
	public void setLoanAccountNumber(int loanAccountNumber) {
		LoanAccountNumber = loanAccountNumber;
	}
	public String getSecurity() {
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getApprovedManagerId() {
		return approvedManagerId;
	}
	public void setApprovedManagerId(int approvedManagerId) {
		this.approvedManagerId = approvedManagerId;
	}
	public MortageLoanCustomer getMortageLoanCustomer() {
		return mortageLoanCustomer;
	}
	public void setMortageLoanCustomer(MortageLoanCustomer mortageLoanCustomer) {
		this.mortageLoanCustomer = mortageLoanCustomer;
	}
	public LoanDetails(int loanAccountNumber, String security, String address, String loanStatus, long loanAmount,
			int approvedManagerId, MortageLoanCustomer mortageLoanCustomer) {
		super();
		LoanAccountNumber = loanAccountNumber;
		this.security = security;
		this.address = address;
		this.loanStatus = loanStatus;
		this.loanAmount = loanAmount;
		this.approvedManagerId = approvedManagerId;
		this.mortageLoanCustomer = mortageLoanCustomer;
	}
	public LoanDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoanDetails [LoanAccountNumber=" + LoanAccountNumber + ", security=" + security + ", address=" + address
				+ ", loanStatus=" + loanStatus + ", loanAmount=" + loanAmount + ", approvedManagerId="
				+ approvedManagerId + ", mortageLoanCustomer=" + mortageLoanCustomer + "]";
	}
	
	

}
