package com.jade.microservies.poc.bankdetails.service;

import com.jade.microservies.poc.bankdetails.model.Payment;
import com.jade.microservies.poc.bankdetails.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepo paymentRepo;

    public Payment buyCourse(Payment payment){
        return paymentRepo.save(payment);
    }
}
