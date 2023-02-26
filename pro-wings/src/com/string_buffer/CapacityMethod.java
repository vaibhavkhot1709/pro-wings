package com.string_buffer;

public class CapacityMethod {
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hi good afternoon");
		System.out.println(sb.capacity()); // 33
		
		StringBuffer sb1=new StringBuffer("hi good");
		System.out.println(sb1.capacity()); // 23
	}

}
