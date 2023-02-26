package com.object_class2;

public class CloneM1 implements Cloneable {

	int rollno;
	String name;

	CloneM1(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public static void main(String args[]) throws CloneNotSupportedException {
		CloneM1 s1 = new CloneM1(101, "amit");
		CloneM1 s2 = (CloneM1) s1.clone();
		System.out.println(s1.rollno + " " + s1.name);
		System.out.println(s2.rollno + " " + s2.name);


	}

}
