package com.jade.microservies.poc.financialmanagement.repo;

import com.jade.microservies.poc.financialmanagement.model.CourseDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDetailsRepo extends JpaRepository<CourseDetails,Integer> {


}
