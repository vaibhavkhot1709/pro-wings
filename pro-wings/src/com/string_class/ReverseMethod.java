package com.string_class;

public class ReverseMethod {
	public static void main(String[] args) {
		String s1="Vaibhav ";
		int size=s1.length();
		for(int i=0;i<size;i++) {
			System.out.print(s1.charAt(s1.length()-i-1)); // op>> vahbiaV
		}
		System.out.println("\n >>>>>>>>>>");
		String s2="jyoti vahini";
//		int s3=s2.length();
//		for(int i=0;i<s3;i++) {
//			System.out.print(s2.charAt(s2.length()-i-1)); // op>> inihav itoyj
//		}
		for(int i=s2.length()-1;i>=0;i--) {
			System.out.print(s2.charAt(i));
		}
		
//		System.out.println("by String Buffer");
	}

}
