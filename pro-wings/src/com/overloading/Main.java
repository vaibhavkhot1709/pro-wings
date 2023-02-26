package com.overloading;
//// method are static so its method hiding and not method overriding
// so casting and method hiding at same time, 
//so method get call by referance not by object....
public class Main extends A {
	public static void main(String[] args) {
		Main m = new Main();
		m.m1();

		((A) (m)).m1();
		((B) ((A) (m))).m1();
	}
	static void m1() {
		System.out.println("Main");
	}
}
class A extends B {
	static void m1() {
		System.out.println("A");
	}
}
class B {
	static void m1() {
		System.out.println("B");
	}
}