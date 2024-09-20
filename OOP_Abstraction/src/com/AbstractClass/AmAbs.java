package com.AbstractClass;

public abstract class AmAbs implements AmI {
	abstract void getPrice();
	
	@Override
	public void payment()
	{
		System.out.println("Abstract class method");
	}

}
