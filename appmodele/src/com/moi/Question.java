/**
 * 
 */
package com.moi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class Question {

	int idq;
	String question;
	String type;
	List<Reponse> reponses=new ArrayList<Reponse>();
	
	public int getIdq() {
		return idq;
	}
	public void setIdq(int idq) {
		this.idq = idq;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Reponse> getReponses() {
		return reponses;
	}
	public void setReponses(List<Reponse> reponses) {
		this.reponses = reponses;
	}
	@Override
	public String toString() {
		return "Question [idq=" + idq + ", question=" + question + ", type=" + type + ", reponses=" + reponses + "]";
	}
	
	
}
