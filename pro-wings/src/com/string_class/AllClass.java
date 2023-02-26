package com.string_class;

public class AllClass {
	
	
	public static void main(String[] args) {
		 String s="vaibhav";
		 String s1=" Vaibhav";
		 String s2="vaibhav";
		 String s3=" vaibhav";
		 String s4=null;
		 String s5="null";
		
//		System.out.println(s.concat(s1));
		System.out.println(s==s1);  // F bcz case sensitive
		System.out.println(s2==s);  //true
		System.out.println(s3=s);  // F bcz space in s3
		System.out.println(s4=s);  // F bcz space in s3
		System.out.println(s4=s5);  // F bcz diff spell
		System.out.println(s5=s4);  // F bcz diff spell
		System.out.println(s4);
		
	}

}
