package com.hcl.MortageLoan.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.hcl.MortageLoan.Model.BankOfficer;

@Service
public interface BankOfficerService {

	BankOfficer getApprovalLoan(@PathVariable String loanStatus);
	
}
