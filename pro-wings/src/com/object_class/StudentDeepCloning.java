package com.object_class;

class Test {
	int x, y;
}

class Test2 implements Cloneable {
	int a, b;

	Test c = new Test();

	public Object clone() throws CloneNotSupportedException {

		Test2 t = (Test2) super.clone();

		// Creating a deep copy for c
		t.c = new Test();
		t.c.x = c.x;
		t.c.y = c.y;

		return t;
	}

	public String toString() {
		return "StudentDeepCloning [roll=" + a + ", roll2=" + b + "]";
	}
}

public class StudentDeepCloning {

	public static void main(String args[]) throws CloneNotSupportedException {
		Test2 t1 = new Test2();
		t1.a = 10;
		t1.b = 20;
		t1.c.x = 30;
		t1.c.y = 40;

		Test2 t3 = (Test2) t1.clone();
		t3.a = 100;

		// Change in primitive type of t2 will
		// not be reflected in t1 field
		t3.c.x = 300;

		// Change in object type field of t2 will
		// not be reflected in t1(deep copy)
//		System.out.println(t1.a + " < t1a " + t1.b + " < t1b" + t1.c.x + " < t1cx " + t1.c.y+" < t1.cy");
//		System.out.println(t3.a + " < t3a " + t3.b + " <t3b " + t3.c.x + " <t3cx" + t3.c.y+" < t3.cy");
	
	
	
	System.out.println(t1==t3);
	
	
	}

}