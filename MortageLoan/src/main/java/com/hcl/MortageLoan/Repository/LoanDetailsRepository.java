package com.hcl.MortageLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.MortageLoan.Model.LoanDetails;
@Repository
public interface LoanDetailsRepository extends JpaRepository<LoanDetails, Integer>{

}
