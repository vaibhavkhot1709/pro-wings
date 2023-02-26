package com.string_buffer;

public class InsertMethod {
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hi good afternoon");
//		StringBuffer sb1=new StringBuffer(" Khot");
//		System.out.println(sb.insert(2, " kh "));
		System.out.println(sb.replace(8, 17, "evening"));
//		System.out.println(sb.delete(0, 0));
	}

}
