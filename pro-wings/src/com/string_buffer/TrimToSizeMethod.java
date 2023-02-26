package com.string_buffer;

public class TrimToSizeMethod {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hi good afternoon");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.trimToSize();
		System.out.println(sb.capacity());
	
	}

}
