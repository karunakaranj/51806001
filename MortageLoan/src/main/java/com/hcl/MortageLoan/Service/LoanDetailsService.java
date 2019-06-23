package com.hcl.MortageLoan.Service;

import org.springframework.stereotype.Service;

import com.hcl.MortageLoan.Exception.LoanDetailsNotFoundException;
import com.hcl.MortageLoan.Model.LoanDetails;

@Service
public interface LoanDetailsService {
	LoanDetails createLoanAccount(LoanDetails loanDetails) throws LoanDetailsNotFoundException;
}
