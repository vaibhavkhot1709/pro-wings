package com.string_buffer;

public class ReplaceMethod {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hi good afternoon");
		System.out.println(sb.replace(8, 17, "evening"));
	}

}
