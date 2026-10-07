package com.vcube.employemanagement2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.employemanagement2.model.Employee;
import com.vcube.employemanagement2.service.EmployeService;


@CrossOrigin("http://localhost:3000/")
//http:localhost:2323/employee
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	@Autowired
	EmployeService employeeService;
	
	@GetMapping("hello")
	String hello() {
		return "good "; 
	}
		//https://localhost:2323/employee/ getEmployee/1
	@GetMapping("getEmployee/{eid}")	
	 Employee getEmployee(@PathVariable Integer eid) {
		return employeeService. getEmployee(eid);
		
	}
	//http://localhost:2323/employee/updateEmployee/1
	@PutMapping("updateEmployee/{eid}")
	Employee updateEmployee(@PathVariable Integer eid, @RequestBody Employee e) {
		
		Employee employeeFromDB = getEmployee(eid);
		
		employeeFromDB.setSal(e.getSal());
		employeeFromDB.setCity(e.getCity());
		employeeFromDB.setName(e.getName());
		employeeFromDB.setDept(e.getDept());
		
		
		return employeeService.updateEmployee(employeeFromDB);
	}
	
	
	
	
	//http://localhost:2323/employee/deleteEmployee/1
	@DeleteMapping("deleteEmployee/{eid}")
	String deleteEmployee(@PathVariable Integer eid ) {
		employeeService.deleteEmployee(eid);
		return "deleted employee with"+eid+"successfully";
		
	}
		

	//http://localhost:2323/employee/getemp
	@GetMapping("/getemp")
	List<Employee>getAllEmployee(){
		 return employeeService.getAllEmployee();
	}
	
	//http:localhost:2323/employee//createmp
	@PostMapping("/createmp")
	Employee createEmployeeData(@RequestBody Employee e) {
		
		return employeeService.saveEmployee(e);
		
	}
}
