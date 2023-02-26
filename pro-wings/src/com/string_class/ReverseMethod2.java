package com.string_class;

public class ReverseMethod2 {
	public static void main(String[] args) {
		String s1 = "Vaibhav ";
		for (int i = s1.length() - 1; i >= 0; i--)
			System.out.print(s1.charAt(i));

		System.out.println("\n >>>>>>>>>>");

		String s2 = "jyoti vahini";
		for (int i = s2.length() - 1; i >= 0; i--)
			System.out.print(s2.charAt(i));
	}

}
