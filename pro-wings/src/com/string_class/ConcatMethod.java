package com.string_class;

public class ConcatMethod {
	
	public static void main(String[] args) {
		String s1= new String ("durga");
		System.out.println(s1);
		
		String s2=s1.concat("soft");
		System.out.println(s2);	           // op >> durgasoft
		
		s1.concat("soft");
		System.out.println(s1); //op >durga bcz new object get created but it dont have ref.
		
		s2=s2.concat(null);  
		System.out.println(s2);   // NullPointException.... bcz null
		
		
		
	}

}
