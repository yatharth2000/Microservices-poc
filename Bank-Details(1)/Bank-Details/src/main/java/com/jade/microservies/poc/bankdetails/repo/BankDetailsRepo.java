package com.jade.microservies.poc.bankdetails.repo;

import com.jade.microservies.poc.bankdetails.model.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankDetailsRepo extends JpaRepository<BankDetails,Integer> {

}
