package com.overloading;

public class Overloading1 {
	
		public void add(int i,int j) {
			System.out.println("inside first method");
		}
		
		public static void add(int i, long j) {
			System.out.println("inside second method");
		}
		
		public static void main(String[] args) {
		
			Overloading1 o=new Overloading1();
					
			
		}
		

}
