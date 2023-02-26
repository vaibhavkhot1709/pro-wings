package com.string_class;

public class AllInOne {
	public static void main(String[] args) {
		String s1=new String("Vaibhav");
		String s2="Vaibhav ";
		String s3=" KHOT";
		
		
		System.out.println(s1.concat(s3));// 1 concat()
		System.out.println(s1.toUpperCase()); //2 toUpperCase
		System.out.println(s2.toLowerCase());//3 toLowerCase()
		
		System.out.println("\n");
		System.out.println(s1.substring(3)); //4  substring (int i)
		System.out.println(s1.substring(0, 3));//5  substring (int i, int j)
		System.out.println(s1.equals(s2));	//6   equals
		System.out.println(s1.equalsIgnoreCase(s3));  // 7 false  equalsIngnore()
		System.out.println(s1.equalsIgnoreCase(s2));  // false
		
		System.out.println("\n");
		System.out.println(s3.trim()); //8  trim ()
		
		System.out.println(s1.replace('a', 'A')); // 9 replace
		System.out.println(s1.isEmpty());  //10 isEmpty
		
		System.out.println(s2.length()); // 11 length();
		
		int size=s1.length();
		for(int i=0; i<size;i++) {
			System.out.print(s1.charAt(s1.length()-i-1));   // 12 reverse method
		}
		
		System.out.println(s1.charAt(5));  // 13 charAt()
		
		
		
		

		
		
		
		
	}

}
