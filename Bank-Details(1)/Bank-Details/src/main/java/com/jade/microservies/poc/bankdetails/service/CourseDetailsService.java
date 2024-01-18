package com.jade.microservies.poc.bankdetails.service;

import com.jade.microservies.poc.bankdetails.model.CourseDetails;
import com.jade.microservies.poc.bankdetails.repo.CourseDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseDetailsService {

    @Autowired
     CourseDetailsRepo courseDetailsRepo;

    public List<CourseDetails> addCourses(List<CourseDetails> courseDetailsList) {
        return courseDetailsRepo.saveAll(courseDetailsList);
    }
    public List<CourseDetails> showCoursesList() {
        return courseDetailsRepo.findAll();
    }

}
