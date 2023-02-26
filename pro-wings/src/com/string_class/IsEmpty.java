package com.string_class;

public class IsEmpty {
	public static void main(String[] args) {
		String s1="";
		System.out.println(s1.isEmpty());   // if empty then return true
		System.out.println(s1.length());
		
		String s2= "hello";
		System.out.println(s2.isEmpty());  // if not empty then return false
		System.out.println(s2.length());
		
		String s3="  ";
		System.out.println(s3.isEmpty());//in string spaces have some as value so false
		System.out.println(s3.length());
	}

}
