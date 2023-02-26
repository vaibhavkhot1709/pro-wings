package com.object_class2;

public class ToStringM1 {
	String nm;
	int roll;

	ToStringM1(String nm, int roll) {
		this.nm = nm;
		this.roll = roll;
	}

	public ToStringM1() {
	}

	public String toString() {
		return nm + "  " + roll;
	}

	public static void main(String[] args) {
		ToStringM1 a = new ToStringM1();  // null value gives bcz no constructor is there
		
		ToStringM1 a1 = new ToStringM1("Vaibhav", 20);
		ToStringM1 a2 = new ToStringM1("AP", 1);
		
		
		System.out.println(">>>>>>>>>>>>>>>");
		ToStringM1 a3 = null;
		System.out.println(a3);

		System.out.println(a);
		System.out.println(">>>>>>>>>>>");
		
		System.out.println(a1.toString());
		System.out.println(a2);
	}

}
