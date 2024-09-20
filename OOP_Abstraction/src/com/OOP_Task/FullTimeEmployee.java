package com.OOP_Task;

public class FullTimeEmployee extends Employee{
//	private String name;
//	private int employeeID;
	private double salary;
	
	FullTimeEmployee(String name, int employeeID,double salary)
	{
//		this.name=name;
//		this.employeeID=employeeID;
		//instead above lines
		super(name,employeeID);
		this.salary=salary;

	}
	@Override
	
	void displayDetails()
	{
//		System.out.println("Name of the employee is: "+name);
//		System.out.println("ID of the employee is:"+ employeeID);
		super.displayDetails();
		System.out.println("Salary of the employee is : "+salary);
		
		
	}

}
