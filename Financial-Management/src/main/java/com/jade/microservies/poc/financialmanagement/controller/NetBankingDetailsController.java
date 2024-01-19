package com.jade.microservies.poc.financialmanagement.controller;

import com.jade.microservies.poc.financialmanagement.model.NetBankingDetails;
import com.jade.microservies.poc.financialmanagement.service.NetBankingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/modeofpayment/netbanking")
public class NetBankingDetailsController {

    @Autowired
    NetBankingDetailsService bankDetailsService;

    @PostMapping("/savebankdetails")
    public ResponseEntity<NetBankingDetails> saveBankDetails(@RequestBody NetBankingDetails bankDetails){
        return ResponseEntity.ok(bankDetailsService.getBankDetails(bankDetails));
    }
}
