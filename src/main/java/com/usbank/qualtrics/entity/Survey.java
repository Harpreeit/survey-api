package com.usbank.qualtrics.entity;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Survey {

	@Id
	@Column(columnDefinition = "VARCHAR(36)")
	private String id;
	
	@OneToMany
	private List<Result> result;
		
	public Survey() {
		this.id = UUID.randomUUID().toString();
	}
	
	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Survey [id=" + id + ", result=" + result + "]";
	}
	
}
