package com.example.employee.employeedetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	private List<Employee> employees = new ArrayList<>(Arrays.asList(  
	new Employee(1, "Supriya", 26000),
	new Employee(2,"john",24000),
	new Employee(3,"erina",25000)
	));
	
	public List<Employee> getAllEmployees(){
		return employees;
	}

	public void add(Employee employee) {
	employees.add(employee);
		
	}
	 
}
