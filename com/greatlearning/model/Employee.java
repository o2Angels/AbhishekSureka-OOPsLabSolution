package com.greatlearning.model;

public class Employee {
	//Define firtName, lastName, department
	
	private String firstName; //="Abhishek"
	private String lastName; // ="Sureka"
	private String department;//="Finance"
		
	//Create a constructor
	
	public Employee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}	
	//Create getters and setters
	
		public String getfirstName() {
			return firstName;
	  }
		public void setfirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getlastName() {
			return lastName;
	  }
		public void setlastName(String lastName) {
			this.lastName = lastName;
		}
		public String getdepartmemt() {
			return department;
	  }
		public void setdepartment(String department) {
			this.department = department;
		}
	}
