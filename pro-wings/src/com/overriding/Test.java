package com.overriding;

class Demo {
	public void m1(){
		System.out.println("parent");
	}
}

public class Test extends Demo{
	public void m1() {
		System.out.println("child");
	}
	
	public static void main(String[] args) {
//		 Test t = new Test();
//		 t.m1();
//		 
//		 Demo d = new Test();
//		 d.m1();
		 
		 Demo d1 = new Demo();
		 d1.m1();
	}

}
