package com.usbank.qualtrics.service;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.usbank.qualtrics.entity.Questions;
import com.usbank.qualtrics.entity.Responses;
import com.usbank.qualtrics.entity.Result;
import com.usbank.qualtrics.entity.SurveyOutput;
import com.usbank.qualtrics.entity.Survey;
import com.usbank.qualtrics.repository.SurveyOutputRepository;


@Service
public class SurveyServiceImpl implements SurveyService{

	
	@Autowired
	SurveyOutputRepository repository;
		
	
	@Transactional
	public Survey create(Survey survey) {

		
		
        for (Result result : survey.getResult()) {
        	HashMap<String, String> map = new HashMap<>();
        	for(Responses response : result.getResponses()) {
    			String key = response.getQuestionId();
    			String val = response.getSelectedAnswer();
        		map.put(key, val);        		
        	}
        	for(Questions question : result.getQuestions()) {
        		SurveyOutput output = new SurveyOutput();
        		output.setCustomerId(result.getCustomerId());
        		output.setQuestionId(question.getQuestionId());
        		output.setType(question.getType());
        		output.setDisplay(question.getDisplay());
        		output.setSelectedAnswer(map.get(output.getQuestionId()));
        		repository.save(output);
        	}
                   
        }        
        return survey;
	}

}
