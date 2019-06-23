package com.hcl.MortageLoan.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.MortageLoan.Model.MortageLoanCustomer;

import com.hcl.MortageLoan.Service.MortageLoanCustomerServiceImpl;


@RequestMapping("/mortageLoan")
@RestController
public class MortageLoanCustomerController {
	
	@Autowired
	MortageLoanCustomerServiceImpl mortageLoanCustomerServiceImpl;
	
	@PostMapping(value="/saveCustomer")
	public MortageLoanCustomer saveCustomer(@RequestBody MortageLoanCustomer mortageLoanCustomer) {
		return mortageLoanCustomerServiceImpl.saveCustomer(mortageLoanCustomer);
		
	}
	

}
