package com.sindhu.springboot.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics=new ArrayList<>(Arrays.asList(new Topic("100", "Sindhu", "Welcome"), new Topic("101", "Sachin", "Good Morning"),
			new Topic("102", "Savinaya", "Hello")));
	
	public List<Topic> getAllTopics(){
		return topics;
		
	}
	
	public Topic getToipc(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id,Topic topic) {
		
		for(int i=0;i<topics.size();i++) {
			Topic topic2=topics.get(i);
			if(topic2.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteToipc(String id) {
		topics.removeIf(t->t.getId().equals(id));
	
	}
}
