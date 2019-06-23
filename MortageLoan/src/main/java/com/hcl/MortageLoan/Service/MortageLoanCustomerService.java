package com.hcl.MortageLoan.Service;

import org.springframework.stereotype.Service;

import com.hcl.MortageLoan.Exception.CustomerDetailsException;
import com.hcl.MortageLoan.Model.MortageLoanCustomer;
@Service
public interface MortageLoanCustomerService {

	MortageLoanCustomer saveCustomer(MortageLoanCustomer mortageLoanCustomer) throws CustomerDetailsException;
}
