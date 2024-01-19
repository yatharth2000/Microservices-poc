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
public class CourseDetails {

    @Id
    private int courseId;
    private String courseName;
    private String courseDuration;
    private String coursePrice;

}
