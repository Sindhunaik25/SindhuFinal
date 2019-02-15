package com.spring.assignment2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
int questionId;
String questions;
private List<String> answer;
Set<String> answer1;
Map<Integer, String> answer2;
public Map<Integer, String> getAnswer2() {
	return answer2;
}
public void setAnswer2(Map<Integer, String> answer2) {
	this.answer2 = answer2;
}
public Set<String> getAnswer1() {
	return answer1;
}
public void setAnswer1(Set<String> answer1) {
	this.answer1 = answer1;
}
public List<String> getAnswer() {
	return answer;
}
public void setAnswer(List<String> answer) {
	this.answer = answer;
}
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestions() {
	return questions;
}
public void setQuestions(String questions) {
	this.questions = questions;
}
public void display(){
	System.out.println(questionId+"  "+questions+"  "+answer2);
}

}
