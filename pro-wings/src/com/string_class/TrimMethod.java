package com.string_class;

public class TrimMethod {
	public static void main(String[] args) {
		String s1=new String ("   Vaibhav  ");
		
		
		System.out.println(s1.length());
		s1=s1.trim();
		System.out.println(s1);

		System.out.println(s1.length());
	}

}
