package com.jade.microservies.poc.financialmanagement.controller;


import com.jade.microservies.poc.financialmanagement.model.Payment;
import com.jade.microservies.poc.financialmanagement.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enroll")
public class PaymentController {

    @Autowired
    PaymentService paymentService;


    @PostMapping("/buyCourse")
    public ResponseEntity<String> buyCourse(@RequestBody Payment payment) {
        return ResponseEntity.ok(paymentService.buyCourse(payment));
    }
}
