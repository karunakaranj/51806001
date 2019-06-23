package com.hcl.MortageLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.MortageLoan.Model.MortageLoanCustomer;
@Repository
public interface MortageLoanCustomerRepository extends JpaRepository<MortageLoanCustomer, Integer> {

	
}
