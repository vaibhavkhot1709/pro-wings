package com.overloading;

public class Aaa {
	int x=10;
	int y=20;
	public static void main(String[] args) {
		Aaa a=new Aaa();
		System.out.println(a.x);
		int c=a.x+a.y;
		System.out.println(c);
	}

}
