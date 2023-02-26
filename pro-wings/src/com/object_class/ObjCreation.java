package com.object_class;

public class ObjCreation {

	int i;
	String nm;

	ObjCreation() {

	}
	ObjCreation(int i, String nm) {
		this.i = i;
		this.nm = nm;
	}
	public static void main(String[] args) {

//	its an valid statement we can create two object by using this line

//  this is know as Creating multiple objects by one type only....

ObjCreation t1=new ObjCreation(10," vaibhav"),t2=new ObjCreation(20," AP");

		System.out.println(t1.i + t1.nm);
		System.out.println(t2.i + t2.nm);

	}

}
