package com.narendra.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.narendra.exceptionhandling.EmployeeNotFound;
import com.narendra.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable("id") String id) throws Exception {
		String str=null;
		Employee employee = null;
		if("1".equals(id)) {
			employee = new Employee();
			employee.setId(1);;
			employee.setFirstName("Narendra");
			employee.setLastName("Bhumireddypalli");
			employee.setSalary("120 K");
		}
		
		else if("2".equals(id)) {
			employee = new Employee();
			employee.setId(2);;
			employee.setFirstName("Hari");
			employee.setLastName("Bhumireddypalli");
			employee.setSalary("170 K");
		}
		else if(str.equals(id)) {
			employee = new Employee();
			employee.setId(2);;
			employee.setFirstName("Uma");
			employee.setLastName("Bhumireddypalli");
			employee.setSalary("100 K");
		}
		else {
			throw new EmployeeNotFound("Employee Not Found");
		}
		
		return employee;
	}
	
}
