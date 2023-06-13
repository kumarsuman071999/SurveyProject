package com.springboot.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.demo.entity.SurveyQuestion;
import com.springboot.demo.exception.ResourceNotFoundexception;
import com.springboot.demo.repository.Surveyrepository;
import com.springboot.demo.service.SurveyService;



@Service
public class SurveyServiceImpl implements SurveyService {
	

	@Autowired
	private Surveyrepository surveyrepository;
	
	


	@Override
	public List<SurveyQuestion> retriveAllSurvey() {
		// TODO Auto-generated method stub
		
		return surveyrepository.findAll();
	}




	@Override
	public SurveyQuestion saveSurvey(SurveyQuestion survey) {
		// TODO Auto-generated method stub
		return surveyrepository.save(survey);
	}




	@Override
	public SurveyQuestion retriveSurveyById( @PathVariable int id) {
		SurveyQuestion survey=surveyrepository.findById(id).orElseThrow(()-> new ResourceNotFoundexception("survey with id does not exist:" + id) );
		return survey;
	}




	@Override
	public SurveyQuestion updateSurvey(SurveyQuestion surveyDetails, int id) {
		// TODO Auto-generated method stub
		SurveyQuestion survey=surveyrepository.findById(id).orElseThrow(()-> new ResourceNotFoundexception("survey with id does not exist:" + id) );
		survey.setName(surveyDetails.getName());
		survey.setAddress(surveyDetails.getAddress());
		survey.setCountry(surveyDetails.getCountry());
		survey.setGender(surveyDetails.getGender());
		survey.setReligion(surveyDetails.getReligion());
		
		SurveyQuestion update=surveyrepository.save(survey);
		return update;
	
	}




	@Override
	public void deleteSurveyById(int id) {
		// TODO Auto-generated method stub
		surveyrepository.findById(id).orElseThrow(()-> new ResourceNotFoundexception("survey with id does not exist:" + id) );
		
		
		 surveyrepository.deleteById(id);
		
		
	}
	
	




	

	

}
