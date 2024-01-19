package com.jade.microservies.poc.financialmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NetBankingDetails {

    @Id
    private Integer studentId;

   private String bankName;
   private String branchName;
   private String branchNumber;
   private String streetAddress;
   private String streetAddressLine2;
   private String city;
   private String state;
   private String zipCode;
   private String accountHolderName;
   private String accountType;




}
