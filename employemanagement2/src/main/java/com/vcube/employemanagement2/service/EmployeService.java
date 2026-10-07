package com.vcube.employemanagement2.service;

import java.util.List;

import com.vcube.employemanagement2.model.Employee;

public interface EmployeService {

	 Employee saveEmployee(Employee e);

	Employee getEmployee(Integer id);

	List<Employee> getAllEmployee();

	Employee updateEmployee(Employee id);

	void deleteEmployee(Integer id);


}
