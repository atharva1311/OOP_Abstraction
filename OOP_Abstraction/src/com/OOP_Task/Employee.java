package com.OOP_Task;

public class Employee {
	private String name;
	private int employeeID;
	
	Employee()
	{
		
	}
	Employee(String name,int employeeID)
	{
		this.name=name;
		this.employeeID=employeeID;
	}
	
	void displayDetails()
	{
		System.out.println("Name of the employee is : "+name);
		System.out.println("ID of the employee is:"+ employeeID);
		
	}

}
