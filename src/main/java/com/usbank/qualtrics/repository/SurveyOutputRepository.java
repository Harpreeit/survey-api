package com.usbank.qualtrics.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.usbank.qualtrics.entity.SurveyOutput;

@Repository
public interface SurveyOutputRepository extends CrudRepository<SurveyOutput, String>{

	@SuppressWarnings("unchecked")
	SurveyOutput save(SurveyOutput samp);

}
