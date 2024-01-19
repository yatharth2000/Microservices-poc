package com.jade.microservies.poc.financialmanagement.controller;

import com.jade.microservies.poc.financialmanagement.model.CourseDetails;
import com.jade.microservies.poc.financialmanagement.service.CourseDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CourseListController {

    @Autowired
    CourseDetailsService courseDetailsService;

   @PostMapping("/addcourses")
    public ResponseEntity<List<CourseDetails>> addCourses(@RequestBody List<CourseDetails> courseDetailsList){
       return ResponseEntity.ok(courseDetailsService.addCourses(courseDetailsList));
   }

   @GetMapping("/courseList")
    public ResponseEntity<List<CourseDetails>> showCourseList(){
       return ResponseEntity.ok(courseDetailsService.showCourseList());
   }


}
