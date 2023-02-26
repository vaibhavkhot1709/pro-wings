package com.regex;

import java.util.regex.*;
public class RegexPattern {
	public static void main(String[] args) {
//		Pattern p=Pattern.compile("xx");
//		Matcher m=p.matcher("xx");
//		System.out.println(m.matches()); //true
		
//		Pattern p1=Pattern.compile(".xx.");
//		Matcher m1=p1.matcher("xx");
//		System.out.println(m1.matches()); //false
		
//		Pattern p2=Pattern.compile(".xx.");
//		Matcher m2=p2.matcher("!xx!");
//		System.out.println(m2.matches()); //true > we can write anything in matcher as 1 n last index
		
		Pattern p3=Pattern.compile(".xx.");
		Matcher m3=p3.matcher("!xx!");
		System.out.println(m3.matches()); //true > 
		
	}

}
