package com.jade.microservies.poc.financialmanagement.repo;

import com.jade.microservies.poc.financialmanagement.model.NetBankingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetBankingDetailsRepo extends JpaRepository<NetBankingDetails,Integer> {

}
