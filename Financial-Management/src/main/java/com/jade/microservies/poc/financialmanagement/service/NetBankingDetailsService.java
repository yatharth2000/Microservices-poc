package com.jade.microservies.poc.financialmanagement.service;

import com.jade.microservies.poc.financialmanagement.model.NetBankingDetails;
import com.jade.microservies.poc.financialmanagement.repo.NetBankingDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NetBankingDetailsService {

    @Autowired
    NetBankingDetailsRepo bankDetailsRepo;

    public NetBankingDetails getBankDetails(NetBankingDetails bankDetails){
        return bankDetailsRepo.save(bankDetails);
    }
}
