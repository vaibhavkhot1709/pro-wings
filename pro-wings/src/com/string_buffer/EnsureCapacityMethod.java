package com.string_buffer;

public class EnsureCapacityMethod {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hi good afternoon");
		sb.ensureCapacity(99);
		System.out.println(sb.capacity());
		
		
		/*
		 * capacity = (old capacity *2)+2; if we give above this formula then it will
		 * return given ensure capacity
		 */
	}


}
