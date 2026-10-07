package com.vcube.employemanagement2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.employemanagement2.model.Employee;
import com.vcube.employemanagement2.repository.EmployeRepo;
 
@Service
public class EmployeeServiceImpl implements EmployeService {
	@Autowired
	EmployeRepo employeRepo;

	@Override
	public Employee saveEmployee(Employee e) {

		return employeRepo.save(e);
	}

	@Override
	public Employee getEmployee(Integer id) {

		return employeRepo.findById(id).orElseThrow();
	}

	@Override
	public List<Employee> getAllEmployee() {

		return employeRepo.findAll();
	}

	@Override
	public Employee updateEmployee(Employee e) {

		return employeRepo.save(e);
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeRepo.deleteById(id);

	}

}
