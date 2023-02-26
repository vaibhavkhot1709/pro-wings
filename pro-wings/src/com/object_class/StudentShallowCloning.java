package com.object_class;

public class StudentShallowCloning implements Cloneable {

	int roll;
	String nm;
	public StudentShallowCloning() {
		super();
	}
	public StudentShallowCloning(int roll, String nm) {
		super();
		this.roll = roll;
		this.nm = nm;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", nm=" + nm + "]";
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		StudentShallowCloning s1 = new StudentShallowCloning(10, "vaibhav");
//		System.out.println("s1>>>>>" +s1);
		
		StudentShallowCloning s2 = (StudentShallowCloning) s1.clone();
//		System.out.println("s2>>>>>" +s2);

		StudentShallowCloning s3 = (StudentShallowCloning) s2.clone();
//		System.out.println("s3>>>>>" +s1);
		 
		System.out.println(s1==s2);
		System.out.println(s3==s2);

	
	}
}
