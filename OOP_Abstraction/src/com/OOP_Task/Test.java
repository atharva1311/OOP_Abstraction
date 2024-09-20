package com.OOP_Task;

public class Test {
	public static void main(String[] args) {
		FullTimeEmployee f1 = new FullTimeEmployee("Jay",1,50000);
		System.out.println("Full time employee details");
		f1.displayDetails();
		PartTimeEmployee p1 = new PartTimeEmployee("Viru",2,5);
		System.out.println("Part time employee details");
		p1.displayDetails();
	}

}
