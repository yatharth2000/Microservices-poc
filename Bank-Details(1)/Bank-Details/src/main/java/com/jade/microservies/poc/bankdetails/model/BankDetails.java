package com.jade.microservies.poc.bankdetails.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


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
