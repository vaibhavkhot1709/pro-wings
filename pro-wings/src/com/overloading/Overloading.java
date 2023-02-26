package com.overloading;

public class Overloading {
	int x,y;
//	static {
//		System.out.println("hiiii");
//	}
	public static void main(String[] args) {
		Overloading v=new Overloading(10,30);
		
	}
	Overloading(int x, int y){
		super();
		this.x=x;
		this.y=y;
		System.out.println(x);
		System.out.println(y);
	}

}
