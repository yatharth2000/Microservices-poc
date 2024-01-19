package com.jade.microservies.poc.financialmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {

    @Id
    private int studentId;

    private String studentName;

    private int courseId;

    private String courseName;

    private String modeOfPayment;

    private String amount;

    private String status;


}
