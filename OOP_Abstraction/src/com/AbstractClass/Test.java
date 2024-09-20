package com.AbstractClass;

public class Test {
	public static void main(String[] args) {
		Amazon a1 = new Amazon();
		a1.payment();
		//AmAbs a3 = new AmAbs(); we cannot create an object of abstract class
		AmAbs a2 = new Amazon();
		a2.addCart();
		a2.loginCheck();
		}

}
