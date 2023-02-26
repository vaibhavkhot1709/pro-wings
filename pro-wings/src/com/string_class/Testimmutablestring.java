package com.string_class;

public class Testimmutablestring {
	public static void main(String args[]) {
		String s = "Sachin";
		String s2="Sachin";
		s.concat(" Tendulkar");// concat() method appends the string at the end
		System.out.println(s);// will print Sachin because strings are immutable objects
		
	// if we want print both object then we have to store this s.concat in new refernce
		s=s.concat("Tendulkar");
		System.out.println(s);
		
		
	}

}
