package com.jade.microservies.poc.financialmanagement.repo;

import com.jade.microservies.poc.financialmanagement.model.CardDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardDetailsRepo extends JpaRepository<CardDetails,Integer> {


}
