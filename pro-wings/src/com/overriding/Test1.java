package com.overriding;

public  class Test1 {
	public static void main(String[] args) {
		C11 d=new C12();
		d.m1();
	}
}

class C11{

	public void m1() {
		System.out.println(" inside parent ");
	}

}

class C12 extends C11{
	public void m1() {
		System.out.println(" inside child ");
	}
}
