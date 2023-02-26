package com.regex;

import java.util.regex.Pattern;

public class MetaCharacters {
	public static void main(String[] args) {
//		System.out.println(" metacharacter d");
		
//		System.out.println(Pattern.matches("d","abc"));  //false non digit
//		System.out.println(Pattern.matches("d", "1"));  //true  digit
		System.out.println(Pattern.matches("D", "m"));  //true  digit

	}

}
