package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		return ResponseEntity.ok(s);
		
		
	}
	
	@DeleteMapping("/survey/{id}")
	public ResponseEntity<String> deleteSurveyById(@PathVariable int id) {
		
		surveyServiceImpl.deleteSurveyById(id);
		return ResponseEntity.ok("deleted Successfully");
	
	}
	
	@PutMapping("/survey/{id}")
	public ResponseEntity<SurveyQuestion> updateSurvey(@PathVariable int id, @RequestBody SurveyQuestion survey) {
		SurveyQuestion update= surveyServiceImpl.updateSurvey(survey, id);
		return ResponseEntity.ok(update);
	}
	
	@GetMapping("survey/{id}")
	public ResponseEntity<SurveyQuestion> retriveSurveyById(@PathVariable int id) {
		SurveyQuestion e1= surveyServiceImpl.retriveSurveyById(id);
		return ResponseEntity.ok(e1);
	}
	


}
