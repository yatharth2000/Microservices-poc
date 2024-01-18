package com.jade.microservies.poc.bankdetails.repo;

import com.jade.microservies.poc.bankdetails.model.CourseDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDetailsRepo extends JpaRepository<CourseDetails,Integer> {

}

