package com.hcl.MortageLoanService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.MortageLoan.Model.LoanDetails;
import com.hcl.MortageLoan.Repository.LoanDetailsRepository;
import com.hcl.MortageLoan.Service.LoanDetailsServiceImpl;



@RunWith(SpringRunner.class)
@SpringBootTest
public class MortageLoanCustomerServiceTest {
	
	@Mock
	LoanDetailsRepository loanRepo;
	
	@InjectMocks
	LoanDetailsServiceImpl loanServiceImpl;
	
	@Test
	public void addEmployee()
	{
		
		LoanDetails loan = new LoanDetails(56,"Home","Banglore","Pending",45L,1,null);
		Mockito.when(loanRepo.save(loan)).thenReturn(loan);
		//Mockito.when(userProfilesIDao.save(userProfile)).thenReturn(userProfile);
		LoanDetails actualVal=loanServiceImpl.createLoanAccount(loan);
		Assert.assertEquals(loan, actualVal);
	}

}
