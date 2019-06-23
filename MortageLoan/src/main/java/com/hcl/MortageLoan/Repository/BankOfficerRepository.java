package com.hcl.MortageLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.MortageLoan.Model.BankOfficer;

@Repository
public interface BankOfficerRepository extends JpaRepository<BankOfficer, Integer> {
@Query(value ="select * from mortageloan.loan_details where loan_status=?1",nativeQuery=true)
	BankOfficer getApprovalLoan(String loanStatus);
}
