package com.regex;

import java.util.regex.Pattern;

public class RegexQuantifiers {
	public static void main(String[] args) {
//		System.out.println(" ? quantifier");   // ? either one or not
		
//		System.out.println(Pattern.matches("[amn]?", ""));// true a/m/n comes once or not /blank , if space is there then false 
//		System.out.println(Pattern.matches("[amn]?", "a"));// true a/m/n comes once 
//	    System.out.println(Pattern.matches("[amn]?", "aaa")); // false if a comes more than once
//	    System.out.println(Pattern.matches("[amn]?", "ammnnnna")); // false if a/m/n comes more than once
//	    System.out.println(Pattern.matches("[amn]?", "ayza")); // false if a comes more than once
//		System.out.println(Pattern.matches("[amn]?", "an")); // false if a,m,n must comes one 
//		System.out.println(Pattern.matches("[amn]?", "amn")); // false either one nor not 
		
//		System.out.println(" + quantifier");  // + define later come once or more
		
//		System.out.println(Pattern.matches("[amn]?", ""));// true a/m/n comes once or blank , if space is there then false 
//		System.out.println(Pattern.matches("[amn]+", "a"));// true a/m/n comes once or more 
//	    System.out.println(Pattern.matches("[amn]+", "aaa")); // true  a comes more than once
//	    System.out.println(Pattern.matches("[amn]+", "ammnnnna")); // true a/m/n comes more than once
//	    System.out.println(Pattern.matches("[amn]+", "ayza")); // false bcz yz not matches
//		System.out.println(Pattern.matches("[amn]+", "an")); // true a,m,n must comes one or m	ore
//		System.out.println(Pattern.matches("[amn]+", "amn")); // true match  
		
//		System.out.println(" * quantifier");
		System.out.println(Pattern.matches("[amn]*", "ammmnna"));// true a/m/n comes zero or more times

		
	}

}
