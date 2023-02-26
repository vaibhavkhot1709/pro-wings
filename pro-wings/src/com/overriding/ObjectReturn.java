package com.overriding;

public class ObjectReturn {
	public static void main(String[] args) {
//		C1 c = new C();
//		c.m1();
//		
		C d= new C();
		d.m1();
					
	}

}

class C1 {

	public Object m1() {
		System.out.println("inside parent");
		return null;
	}
}

class C extends C1 {
	public Number m1() {
		System.out.println(" inside child");
		return null;
	}
}
