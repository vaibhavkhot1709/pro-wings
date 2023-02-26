package com.overloading;

class Y {
	void m1(String a) {
		System.out.println("string");

	}

	void m1(StringBuffer a) {
		System.out.println("StringBuffer");

	}

	void m1(StringBuilder a) {
		System.out.println("StringBuilder");

	}
}

public class X extends Y {
	public static void main(String[] args) {
			X x = new X();
			Y y=new Y();
			Y z=new X();
			y.m1("null");
//			y.m1(null);
			y.m1("");

	}
}
