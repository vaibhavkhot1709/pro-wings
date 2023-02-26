package com.overloading;

public class Overloading2 {
	public void m1(int i) {
		System.out.println("inside int m1");
	}
	
	public void m1(long l) {
		System.out.println("inside long m1");
	}
	
	public void m1(char c) {
		System.out.println("inside char m1");
	}
	
	public void m1(Integer j) {
		System.out.println("inside INTEGER m1");
	}
	
	public void m1(Long l1) {
		System.out.println(" inside LONG wrapper m1");
	}
	
	public void m1(Character c1) {
		System.out.println(" inside Character m1");
	}
	
	
	public static void main(String[] args) {
		Overloading2 o=new Overloading2();
//		char x='a';
		o.m1(10l);
	}
}
