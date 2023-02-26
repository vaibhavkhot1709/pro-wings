package com.string_class;

public class ToCharArrayMethod {
	public static void main(String[] args) {
		String s1=new String ("hello");
		String s2="Vaibhav";
		char [] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]); // print hello in line
		}
	}

}