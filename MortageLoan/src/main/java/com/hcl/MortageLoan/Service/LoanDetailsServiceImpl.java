package com.hcl.MortageLoan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.MortageLoan.Model.LoanDetails;
import com.hcl.MortageLoan.Repository.LoanDetailsRepository;

@Service
public class LoanDetailsServiceImpl implements LoanDetailsService {
	
     @Autowired
	LoanDetailsRepository loanDetailsRepository;

public LoanDetails createLoanAccount(LoanDetails loanDetails) {
	return loanDetailsRepository.save(loanDetails);
	
}

}
