package com.string_class;

public class Reverse2 {
	public static void main(String[] args) {
		String s=new String("Jyoti Vahini");
		System.out.println(s);
		
//		System.out.println("substring is ");
		String s1=s.substring(6);
//		System.out.println(s1);
		
		int size=s1.length();
//		System.out.println(size);
		System.out.println("only Vahini in reverse");
		for(int i=0;i<size;i++) {
			System.out.print(s1.charAt(s1.length()-i-1));
		}
	}

}
