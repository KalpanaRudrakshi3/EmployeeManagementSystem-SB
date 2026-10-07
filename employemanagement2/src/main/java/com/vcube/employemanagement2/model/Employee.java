 package com.vcube.employemanagement2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employee77")
@Setter
@Getter
public class Employee {
	 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer eid;

String name;
 int sal;
 String dept;
 String city;

}
