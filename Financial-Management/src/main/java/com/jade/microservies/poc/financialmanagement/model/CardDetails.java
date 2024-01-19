package com.jade.microservies.poc.financialmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardDetails {

    @Id
    private Integer studentId;

    private String nameOnCard;

    private String cardNumber;

    private String expiryDate;

    private String cvv;

}
