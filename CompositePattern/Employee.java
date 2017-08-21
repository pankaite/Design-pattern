package com.kate.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String department;
	private int salary;
	private List<Employee> subordinates;

	public Employee(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

	public void addEmployee(Employee employee) {
		subordinates.add(employee);
	}

	public void removeEmployee(Employee employee) {
		subordinates.remove(employee);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	@Override
	public String toString() {
		return ("Employee :[ Name : " + name + ", dept : " + department + ", salary :" + salary + " ]");
	}
}
