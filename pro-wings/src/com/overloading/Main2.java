package com.overloading;
// overriding and casting at same time, so method get call by object not by referance  
public class Main2 extends A12 {
	public static void main(String[] args) {
		Main2 m = new Main2();
//		m.m1();

//		((A12) (m)).m1();
	((B11) ((A12) (m))).m1();
	}
	 void m1() {
		System.out.println("Main");
	}
}
class A12 extends B11 {
	 void m1() {
		System.out.println("A");
	}
}
class B11 {
	 void m1() {
		System.out.println("B");
	}
}