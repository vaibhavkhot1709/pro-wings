package com.overloading;

public class Aa {
	static {
		System.out.println("1 S");
	}
	{
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	Aa() {
		System.out.println(" super()");
	}
	public void m1() {
		System.out.println("inside static method");
	}
	public static void main(String[] args) {
		Aa a = new Aa();
		a.m1();
//		Aa b = new Aa();
//		b.m1();
	}
	static {
		System.out.println("2 s");
	}
}