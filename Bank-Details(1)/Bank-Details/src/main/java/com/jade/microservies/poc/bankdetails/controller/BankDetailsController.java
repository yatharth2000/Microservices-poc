package com.jade.microservies.poc.bankdetails.controller;

import com.jade.microservies.poc.bankdetails.model.BankDetails;
import com.jade.microservies.poc.bankdetails.service.BankDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bankdetails")
public class BankDetailsController {

    @Autowired
    private BankDetailsService bankDetailsService;

    @PostMapping("/savebankdetails")
    public ResponseEntity<BankDetails> saveBankDetails(@RequestBody BankDetails bankDetails){
        return ResponseEntity.ok(bankDetailsService.getBankDetails(bankDetails));
    }

}
