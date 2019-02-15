package com.sindhu.assignment8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean{
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@Override
public void afterPropertiesSet() throws Exception {
	 System.out.println("Init method before properties are set(Annotations) : " + name);
	
}

@Override
public void destroy() throws Exception {
	 System.out.println("Destroy method after properties are set(Annotations) : " + name);
	
}



}
