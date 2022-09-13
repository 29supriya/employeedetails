package com.example.employee.employeedetails;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController{
	@Autowired
	
	private EmployeeService employeeService;
    @RequestMapping("/employees")
    public List<Employee> getAllEmployees(){
     return employeeService.getAllEmployees();
    }
    @RequestMapping(method=RequestMethod.POST, value="/employees")
    public void addEmployee(@RequestBody Employee employee) {
    	employeeService.add(employee);
    	
    }


}
