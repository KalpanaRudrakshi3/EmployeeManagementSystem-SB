package com.vcube.employemanagement2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.vcube.employemanagement2.model.Employee;
@Repository
public interface EmployeRepo extends JpaRepository<Employee,Integer > {

}
 