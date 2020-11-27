package com.employe;

import java.time.LocalDate;

public class Employee  {
	
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfJoining;
	private String dept;
	private String designation;
	private boolean isManager;
	private int managerId;
	private int salary;
	
	
	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}


	public String getDept() {
		return dept;
	}


	public String getDesignation() {
		return designation;
	}


	public boolean isManager() {
		return isManager;
	}


	public int getManagerId() {
		return managerId;
	}


	public int getSalary() {
		return salary;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastname(String lastName) {
		this.lastName = lastName;
	}


	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	 public int getManagerID(Employee employee) { return employee.managerId; }
	
	public Employee(int id, String firstName, String lastName, LocalDate dateOfJoining, String dept, String designation,
			boolean isManager, int managerId, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfJoining = dateOfJoining;
		this.dept = dept;
		this.designation = designation;
		this.isManager = isManager;
		this.managerId = managerId;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfJoining="
				+ dateOfJoining + ", dept=" + dept + ", designation=" + designation + ", isManager=" + isManager
				+ ", managerId=" + managerId + ", salary=" + salary + "]";
	}


	
}
