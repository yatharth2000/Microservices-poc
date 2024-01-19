package com.jade.microservies.poc.financialmanagement.repo;

import com.jade.microservies.poc.financialmanagement.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<Payment,Integer> {
}
