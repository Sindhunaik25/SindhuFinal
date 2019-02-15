package com.sindhu.assignment8;

public class EmployeeInitDestroy {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void init() throws Exception{
		System.out.println("Init method before properties are set : " + name);
	}
	public void cleanUp() throws Exception{
		System.out.println("Destroy method after properties are set : " + name);
	}
}
