package com.object_class2;

public class Clone implements Cloneable {
	int i;
	int j;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Clone c1=new Clone();
		Clone c2=(Clone)c1.clone();
		c2.i=23;
		c2.j=32;
		
		System.out.println(c2.i+"..."+c2.j);
	}

}
