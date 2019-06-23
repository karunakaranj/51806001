package com.hcl.MortageLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.MortageLoan.Model.BankOfficer;
@Repository
public interface BankOfficerRepository extends JpaRepository<BankOfficer, Integer> {

}
