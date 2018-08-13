package com.usbank.qualtrics.entity;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SurveyOutput {
	
	@Id
	@Column(columnDefinition="VARCHAR(36)")
	private String id;
	
	private String customerId;
	
	private String questionId;
	
	private String type;
	
	private String display;
	
	private String selectedAnswer;
	
	public SurveyOutput() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getSelectedAnswer() {
		return selectedAnswer;
	}

	public void setSelectedAnswer(String selectedAnswer) {
		this.selectedAnswer = selectedAnswer;
	}

	@Override
	public String toString() {
		return "SampleDB [id=" + id + ", customerId=" + customerId + ", questionId=" + questionId + ", type=" + type
				+ ", display=" + display + ", selectedAnswer=" + selectedAnswer + "]";
	}
	
}
