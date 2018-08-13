package com.usbank.qualtrics.entity;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Questions {

	@Id
	@Column(columnDefinition = "VARCHAR(36)")
	private String id;
	
	private String questionId;

	private String type;
	
	private String display;
	
	@ManyToOne
	private Result result;
	
	public Questions() {
		this.id = UUID.randomUUID().toString();
	}
	
	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
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

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", questionId=" + questionId + ", type=" + type + ", display=" + display
				+ ", result=" + result + "]";
	}


}
