package com.sindhu.assignment2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
int qsnId;
String question;
List<String> answer;
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
public int getQsnId() {
	return qsnId;
}
public void setQsnId(int qsnId) {
	this.qsnId = qsnId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<String> getAnswer() {
	return answer;
}
public void setAnswer(List<String> answer) {
	this.answer = answer;
}
void display(){
	System.out.println("QuestionId: "+qsnId +" "+"Question: "+question+" "+"Answer: "+answer2);
}
}
