package com.overriding;

class A11{
	public void m1() {
		System.out.println("inside parent method");
	}
	public void m2() {
		System.out.println("inside m2 method");
	}
}
public class A1 extends A11 {
	public void m1() {
		System.out.println("inside child method");
	}
	
	public static void main(String[] args) {
		A11 a=new A1();
//		a.m1();
		a.m2();
	}
}
