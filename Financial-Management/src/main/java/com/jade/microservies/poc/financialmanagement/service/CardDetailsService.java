package com.jade.microservies.poc.financialmanagement.service;

import com.jade.microservies.poc.financialmanagement.model.CardDetails;
import com.jade.microservies.poc.financialmanagement.repo.CardDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardDetailsService {

    @Autowired
    CardDetailsRepo cardDetailsRepo;

    public CardDetails cardDetails(CardDetails cardDetails){
        return cardDetailsRepo.save(cardDetails);
    }
}
