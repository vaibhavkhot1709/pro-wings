package com.overriding;

class B {
	public void m1() {
		System.out.println(" inside parent method");
	}
	
}

public class A extends B {
	
	public void m1() {
		System.out.println(" inside childs class method");
	}

	public static void main(String[] args) {
//		A b= new A();
//		b.m1();
		
		B c = new B();
		c.m1();
		
//		A d = new B();
//		d.m1();
		
	}

}



