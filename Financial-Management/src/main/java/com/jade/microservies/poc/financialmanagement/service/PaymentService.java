package com.jade.microservies.poc.financialmanagement.service;

import com.jade.microservies.poc.financialmanagement.model.CourseDetails;
import com.jade.microservies.poc.financialmanagement.model.Payment;
import com.jade.microservies.poc.financialmanagement.repo.CourseDetailsRepo;
import com.jade.microservies.poc.financialmanagement.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepo paymentRepo;

    @Autowired
    CourseDetailsRepo courseDetailsRepo;

    public String buyCourse(Payment payment) {

        boolean flag = false;
        for (CourseDetails courseDetails1 : courseDetailsRepo.findAll()) {
            if (courseDetails1.getCourseId() == payment.getCourseId() && courseDetails1.getCoursePrice().equals(payment.getAmount())) {
                Payment payment1 = new Payment();
                payment1.setStudentId(payment.getStudentId());
                payment1.setStudentName(payment.getStudentName());
                payment1.setCourseId(payment.getCourseId());
                payment1.setCourseName(payment.getCourseName());
                payment1.setModeOfPayment(payment.getModeOfPayment());
                payment1.setAmount(payment.getAmount());
                payment1.setStatus("Paid");
                paymentRepo.save(payment1);
                flag = true;
                return "Course Registered Successfully";
            }
        }
        if (!flag) {
            payment.setStatus("Pending");
            paymentRepo.save(payment);
        }
        return "Payment pending";
    }
}
