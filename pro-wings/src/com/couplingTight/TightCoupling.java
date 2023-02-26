package com.couplingTight;

public class TightCoupling {

	public static void main(String[] args) {

		Running run=new Car();
		run.run();
		
		Running run1=new Car();
		run1.run();
		
		Running run2= new Bike();
		run2.run();
	}
}
