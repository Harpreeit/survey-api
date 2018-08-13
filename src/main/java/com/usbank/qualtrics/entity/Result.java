package com.usbank.qualtrics.entity;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


public class Result {

	@Id
	@Column(columnDefinition = "VARCHAR(36)")
	private String id;
    
	private String customerId;
    
    @OneToMany
    private List<Questions> questions;
    
    @OneToMany
    private List<Responses> responses;
        
    private String done;

	@ManyToOne
	private Survey survey;
	
    public Result() {
		this.id = UUID.randomUUID().toString();
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}

	public List<Responses> getResponses() {
		return responses;
	}

	public void setResponses(List<Responses> responses) {
		this.responses = responses;
	}

	public String getDone() {
		return done;
	}

	public void setDone(String done) {
		this.done = done;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", customerId=" + customerId + ", questions=" + questions + ", responses="
				+ responses + ", done=" + done + ", survey=" + survey + "]";
	}

}
