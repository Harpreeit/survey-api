package com.usbank.qualtrics.controller;
import java.io.File;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.usbank.qualtrics.entity.Survey;
import com.usbank.qualtrics.service.SurveyService;


@RestController
@RequestMapping(value = "/surveys")
public class SurveyController {
	
	@Autowired
	SurveyService service;

	
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
                    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Survey create(@RequestBody Survey survey)    {	
		
    	
		try 
		{
			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			survey = mapper.readValue(new File("target/survey.json"), Survey.class);

		} 
        catch (JsonGenerationException e)
        {
            e.printStackTrace();
        } 
		catch (JsonMappingException e) 
		{
            e.printStackTrace();
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }

        return service.create(survey);

	}
    
}
