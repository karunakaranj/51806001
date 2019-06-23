package com.hcl.MortageLoan.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankOfficer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int approvedManagerIdManagerId;
	private String approvedManagerName;
	private String approvedManagerLevel;
	public int getApprovedManagerIdManagerId() {
		return approvedManagerIdManagerId;
	}
	public void setApprovedManagerIdManagerId(int approvedManagerIdManagerId) {
		this.approvedManagerIdManagerId = approvedManagerIdManagerId;
	}
	public String getApprovedManagerName() {
		return approvedManagerName;
	}
	public void setApprovedManagerName(String approvedManagerName) {
		this.approvedManagerName = approvedManagerName;
	}
	public String getApprovedManagerLevel() {
		return approvedManagerLevel;
	}
	public void setApprovedManagerLevel(String approvedManagerLevel) {
		this.approvedManagerLevel = approvedManagerLevel;
	}
	public BankOfficer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankOfficer(int approvedManagerIdManagerId, String approvedManagerName, String approvedManagerLevel) {
		super();
		this.approvedManagerIdManagerId = approvedManagerIdManagerId;
		this.approvedManagerName = approvedManagerName;
		this.approvedManagerLevel = approvedManagerLevel;
	}
	@Override
	public String toString() {
		return "BankOfficer [approvedManagerIdManagerId=" + approvedManagerIdManagerId + ", approvedManagerName="
				+ approvedManagerName + ", approvedManagerLevel=" + approvedManagerLevel + "]";
	}
	
	
	

}
