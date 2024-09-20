package com.OOP_Task;

public class PartTimeEmployee extends Employee {
	private double hourlyRate;
//	private String name;
//	private int employeeID;

	PartTimeEmployee(String name, int employeeID, double hourlyRate) {
//		this.name=name;
//		this.employeeID=employeeID;
		super(name, employeeID);
		this.hourlyRate = hourlyRate;
	}

	@Override

	void displayDetails() {
//		System.out.println("Name of the employee is: "+name);
//		System.out.println("ID of the employee is:"+ employeeID);
		super.displayDetails();
		System.out.println("Hourly work of the employee is : " + hourlyRate);

	}

}
