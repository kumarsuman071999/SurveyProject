package com.springboot.demo.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.demo.entity.SurveyQuestion;

@Repository
public interface Surveyrepository extends JpaRepository<SurveyQuestion, Integer>{

}
