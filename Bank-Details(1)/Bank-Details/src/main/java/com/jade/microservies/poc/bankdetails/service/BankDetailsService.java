package com.jade.microservies.poc.bankdetails.service;

import com.jade.microservies.poc.bankdetails.model.BankDetails;
import com.jade.microservies.poc.bankdetails.repo.BankDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankDetailsService {

    @Autowired
    BankDetailsRepo bankDetailsRepo;

    public BankDetails getBankDetails(BankDetails bankDetails){
        return bankDetailsRepo.save(bankDetails);
    }

}
