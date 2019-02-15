package com.rest.assignment.Assignment5.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rest.assignment.Assignment5.model.Employee;

public class EmpDAO {
	List<Employee> list = new ArrayList<>();

	public boolean addEmp(int employeeId, String employeeName, String employeeDepartment, String employeeDesignation,
			double employeeSalary) {
		list.add(new Employee(employeeId, employeeName, employeeDepartment, employeeDesignation, employeeSalary));
		return true;

}

}


