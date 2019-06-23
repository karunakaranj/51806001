package com.hcl.MortageLoan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.MortageLoan.Model.BankOfficer;
import com.hcl.MortageLoan.Repository.LoanDetailsRepository;


@Service
public class BankOfficerServiceImpl implements BankOfficerService {
	
	@Autowired
	BankOfficer bankOfficerRepository;
	
	@Autowired
	LoanDetailsRepository loanRepository;
	
	@Override
	public BankOfficer getApprovalLoan(String loanStatus) {
		// TODO Auto-generated method stub
		return null;
	}

}
