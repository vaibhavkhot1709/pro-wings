package com.object_class2;

public class CloneMethod implements Cloneable {
	int a=10;
	String nm="durga";

	CloneMethod(int a, String nm) {
		this.a = a;
		this.nm = nm;
	}
	public static void main(String args[]) throws CloneNotSupportedException {

		CloneMethod t1 = new CloneMethod(10, "durga");
		
		CloneMethod t2 = (CloneMethod)t1.clone();

		System.out.println(t1.a + "   " + t1.nm);
		System.out.println(t2.a+"..."+t2.nm);
		
//		 these below two lines are also same as above
		System.out.println(t2.a);
		System.out.println(t2.nm);
	}
}