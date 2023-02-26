package com.object_class2;

public class HashCodeM {
	int roll;
	HashCodeM(int roll) {
		this.roll = roll;
	}
	public int hashcode() {
		return roll;
	}
	public static void main(String[] args) {
		HashCodeM h1 = new HashCodeM(10);
		HashCodeM h2 = new HashCodeM(120);
		
		System.out.println(h1);
		System.out.println("object hashcode");
		System.out.println(h1.hashCode());  // this method is of Object class
		
		System.out.println(h2);
		System.out.println("object hashcode");
		System.out.println(h2.hashCode());      // this method is of Object class
		
		System.out.println(h1.hashcode());  ///this two of my class
		System.out.println(h2.hashcode());
	}
}
