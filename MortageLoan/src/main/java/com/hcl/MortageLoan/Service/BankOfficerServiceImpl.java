package com.hcl.MortageLoan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.MortageLoan.Repository.BankOfficerRepository;

@Service
public class BankOfficerServiceImpl implements BankOfficerService {
	
	@Autowired
	BankOfficerRepository bankOfficerRepository;
	
	//public BankOfficer approveLoan();

}
