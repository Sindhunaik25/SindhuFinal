package com.rest.assignment.Assignment5.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rest.assignment.Assignment5.dao.EmpDAO;
import com.rest.assignment.Assignment5.model.Employee;

public class ServiceEmp {
	
	EmpDAO dao = new EmpDAO();

	public boolean createAccountEmployee(int employeeId, String employeeName, String employeeDepartment,
			String employeeDesignation, double employeeSalary) {

		return dao.addEmp(employeeId, employeeName, employeeDepartment, employeeDesignation, employeeSalary);
	}

}
