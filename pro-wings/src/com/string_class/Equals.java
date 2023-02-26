package com.string_class;

public class Equals {
	public static void main(String[] args) {
//		String class override equals() so it check content equality not reference 
		
		String s1=new String ("Vaibhav");
		String s2="Vaibhav";
		String s3="Khot ";
		
//		System.out.println(s1==s2);   // false bcz == check reference which diff.
//		System.out.println(s1.equals(s2));  // true bcz content checks 
//		System.out.println(s1==s3); //c
//		System.out.println(s2==s3);  // concat always create a new Obj
		System.out.println(s3.concat(s1));
	}

}
