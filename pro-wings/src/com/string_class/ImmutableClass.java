package com.string_class;

final class Immut{
	private int i;
	
	Immut(int i){
		this.i=i;
	}

	public Immut getI(int i) {
		if(this.i==i)
			return this;
		else
			return (new Immut(i));
	}

}
public class ImmutableClass {
	public static void main(String[] args) {
		Immut i1=new Immut(10);
		Immut t2=i1.getI(100);
		Immut t3=i1.getI(10);
		Immut t4=t2.getI(20);
		
		System.out.println(i1==t2); 
		System.out.println(i1==t3);
		System.out.println(t2==t4);
	}

}
