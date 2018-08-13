package com.usbank.qualtrics.entity;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


public class Responses {

	@Id
	@Column(columnDefinition = "VARCHAR(36)")
	private String id;
	
	private String questionId;
	
	private String selectedAnswer;

	@ManyToOne
	private Result result;
	
	public Responses() {
		this.id = UUID.randomUUID().toString();
	}
	
	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getSelectedAnswer() {
		return selectedAnswer;
	}

	public void setSelectedAnswer(String selectedAnswer) {
		this.selectedAnswer = selectedAnswer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Responses [id=" + id + ", questionId=" + questionId + ", selectedAnswer=" + selectedAnswer + ", result="
				+ result + "]";
	}


}
