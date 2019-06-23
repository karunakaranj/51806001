package com.hcl.MortageLoan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.MortageLoan.Exception.LoanDetailsNotFoundException;
import com.hcl.MortageLoan.Model.LoanDetails;
import com.hcl.MortageLoan.Service.LoanDetailsServiceImpl;
@RequestMapping("/loan")
@RestController
public class LoanDetailsController {
	
	@Autowired
	LoanDetailsServiceImpl loanDetailsServiceImpl;
	
	@PostMapping("/createLoanAccount")
	public LoanDetails createLoanAccount(@RequestBody LoanDetails loanDetails) throws  LoanDetailsNotFoundException
	{
		return loanDetailsServiceImpl.createLoanAccount(loanDetails);
		
	}

}
