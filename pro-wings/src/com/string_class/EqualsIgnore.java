package com.string_class;

public class EqualsIgnore {
	public static void main(String[] args) {
//		 equalsIgnoreCase() egnore the case i.e. egnore capital or small latters
		
		String s1=new String ("Vaibhav");
		String s2="vaibhav";
		String s3="Khot ";
		
//		System.out.println(s1.equalsIgnoreCase(s2)); // true bcz egnore upper lower case
//		System.out.println(s1.equalsIgnoreCase(s3)); // false bcz content different
		System.out.println(s2.equalsIgnoreCase(s3)); // false bcz content different
	}

}
