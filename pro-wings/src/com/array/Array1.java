package com.array;

public class Array1 {
	int c,d;
	int a[] = { 10, 20, 30, 40,50};

	void m1() {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			c = c + a[i];
		}
		System.out.println("addition of all elements of array is"+c);
	}
	
	
	void m2() {
		for(int i: a) {
			d+=i;
		}
		System.out.println("addition by for each is "+d);
	}
	public static void main(String[] args) {
		Array1 a = new Array1();
		a.m1();
		a.m2();
	}
}
