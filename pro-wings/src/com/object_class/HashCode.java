package com.object_class;

public class HashCode {
	int i;
	
	HashCode(int i){
		this.i=i;
	}
	
	public static void main(String[] args) {
		HashCode h1=new HashCode(10);
		
//		if we are passing string here then it return 0 number as result
//		object hashcode() get called here and result given by jvm itself...
		System.out.println(h1.hashCode());
		
//		we have to override hashcode() for our own result as below and call
		
		System.out.println(h1.hashCode()); // so result is 1o in this case
	}
	
	public int hashCode() {
		return i;
	}
}
