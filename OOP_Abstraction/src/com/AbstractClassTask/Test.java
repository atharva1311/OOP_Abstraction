package com.AbstractClassTask;

public class Test {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.move();
		c1.startEngine();
		c1.stopEngine();
		Bicycle b1 = new Bicycle();
		System.out.println("***************");
		b1.move();
		b1.startEngine();
		b1.stopEngine();
	}

}
