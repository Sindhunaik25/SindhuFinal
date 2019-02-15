package com.sindhu.assignment8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmployeePostPre {
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@PostConstruct
public void init() throws Exception{
	System.out.println("Init method after properties are set using PostConstruct and  PreDestroy: " + name);
}
@PreDestroy
public void cleanUp() throws Exception{
	System.out.println("Init method before properties are set using PostConstruct and  PreDestroy: " + name);
}
}
