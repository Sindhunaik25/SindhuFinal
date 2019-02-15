package com.sindhu.assignment8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class MyCofiguration {
	@Bean
    @Scope(value="singleton")
    public EmployeePostPre employeePostPre() {
	return new EmployeePostPre();
    }
	
}
