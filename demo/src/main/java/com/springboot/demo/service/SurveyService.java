package com.springboot.demo.service;

import java.util.List;

import com.springboot.demo.entity.SurveyQuestion;

public interface SurveyService {
	
	public  List<SurveyQuestion> retriveAllSurvey();
	
	public SurveyQuestion retriveSurveyById(int id);
	
	public SurveyQuestion saveSurvey(SurveyQuestion survey);
	
	public SurveyQuestion updateSurvey(SurveyQuestion survey, int id);
	
	public void deleteSurveyById(int id);
	

}
