package com.jade.microservies.poc.financialmanagement.controller;

import com.jade.microservies.poc.financialmanagement.model.CardDetails;
import com.jade.microservies.poc.financialmanagement.service.CardDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modeofpayment/card")
public class CardDetailsController {

    @Autowired
    CardDetailsService cardDetailsService;

    @PostMapping("/saveCardDetails")
    public ResponseEntity<CardDetails> saveCardDetails(@RequestBody CardDetails cardDetails){
        return ResponseEntity.ok(cardDetailsService.cardDetails(cardDetails));
    }
}
