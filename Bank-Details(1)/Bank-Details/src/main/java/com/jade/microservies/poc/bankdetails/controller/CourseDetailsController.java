package com.jade.microservies.poc.bankdetails.controller;

import com.jade.microservies.poc.bankdetails.model.CourseDetails;
import com.jade.microservies.poc.bankdetails.service.CourseDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/")
public class CourseDetailsController {

    @Autowired
     CourseDetailsService courseDetailsService;

    @PostMapping ("/addcourses")
    public ResponseEntity<List<CourseDetails>> addcourses(@RequestBody List<CourseDetails>courseDetailsList) {
        return ResponseEntity.ok(courseDetailsService.addCourses(courseDetailsList));
    }

    @GetMapping("/courseList")
    public ResponseEntity<List<CourseDetails>> showCoursesList() {
        return ResponseEntity.ok(courseDetailsService.showCoursesList());
    }



}
