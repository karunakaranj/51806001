package com.hcl.MortageLoan.Service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.MortageLoan.Exception.CustomerDetailsException;
import com.hcl.MortageLoan.Model.MortageLoanCustomer;
import com.hcl.MortageLoan.Repository.MortageLoanCustomerRepository;
@Service
public class MortageLoanCustomerServiceImpl implements MortageLoanCustomerService {

	private static Logger logger = Logger.getLogger(MortageLoanCustomerServiceImpl.class.getName());

	@Autowired
	MortageLoanCustomerRepository mortageLoanCustomerRepository;

	@Override
	public MortageLoanCustomer saveCustomer(MortageLoanCustomer mortageLoanCustomer) {

//		if (mortageLoanCustomer.getCustomerName() == null && mortageLoanCustomer.getCustomerGender() == null) {
//			logger.info("inside Create customer method customer name and gender  is null");
//			throw new CustomerDetailsException("Employee not created");
//		} else {
			mortageLoanCustomer = mortageLoanCustomerRepository.save(mortageLoanCustomer);
			logger.info("inside create customer method");

		//}

		return mortageLoanCustomer;
	}
}
