/**
 * 
 */
package com.moi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class Quiz {

	int id;
	String title;
	String description;
	LocalDateTime date;
	
	List<Question> questions=new ArrayList<Question>();

	QuizConfig config;
	
	public QuizConfig getConfig() {
		return config;
	}

	public void setConfig(QuizConfig config) {
		this.config = config;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", title=" + title + ", description=" + description + ", questions=" + questions
				+ "]";
	}
	
	
}
