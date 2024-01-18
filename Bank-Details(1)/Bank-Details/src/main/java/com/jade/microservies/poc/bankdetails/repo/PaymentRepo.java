package com.jade.microservies.poc.bankdetails.repo;

import com.jade.microservies.poc.bankdetails.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<Payment,Integer> {

}
