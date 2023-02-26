package com.object_class;

import com.overriding.A;

public class GetClass {
	
	public static void main(String[] args) {
		GetClass cm=new GetClass();
//	System.out.println(cm.getClass());
        A a=new A();
        System.out.println(a.getClass().getName());
	}
}