package com.springboot.demo.controller;

import java.rmi.ServerException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.entity.SurveyQuestion;
import com.springboot.demo.serviceimpl.SurveyServiceImpl;


@RestController
public class SurveyController {
	

	@Autowired
    private SurveyServiceImpl surveyServiceImpl;
	
	

	@GetMapping("/survey")
	public ResponseEntity<List<SurveyQuestion> >retriveAllSurvey(){
		return  ResponseEntity.ok(surveyServiceImpl.retriveAllSurvey()) ;
	}
	
	@PostMapping("/survey")
	public ResponseEntity<SurveyQuestion> saveSurvey(@RequestBody SurveyQuestion survey) {
		SurveyQuestion s= surveyServiceImpl.saveSurvey(survey);
		return new ResponseEntity<>(s,HttpStatus.CREATED);
		
		
	}
	
	@DeleteMapping("/survey/{id}")
	public String deleteSurveyById(@PathVariable int id) {
		surveyServiceImpl.deleteSurveyById(id);
		return "Deleted successfully";
	}
	
	@PutMapping("/survey/{id}")
	public String updateSurvey(@PathVariable int id, @RequestBody SurveyQuestion survey) {
		surveyServiceImpl.updateSurvey(survey, id);
		return "Updated successfully";
	}
	
	@GetMapping("survey/{id}")
	public SurveyQuestion retriveSurveyById(@PathVariable int id) {
		return surveyServiceImpl.retriveSurveyById(id);
	}
	


}
