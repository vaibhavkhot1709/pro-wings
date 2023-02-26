package com.object_class2;
// if our class does not contain equals method then object class method get executed
// Object class equals() methods check only reference and not content
// and give result in boolean by checking reference..

// But if equals() is there in our class then it checks content is exact match or not 
// if content is same then results into true and vice varsa

public class EqualsM {
	String nm;
	int roll;
	EqualsM(){
		
	}

	EqualsM(String nm, int roll) {
		this.nm = nm;
		this.roll = roll;
	}
	 public boolean equals(Object obj) {
		 if(obj==this)
	        return true;
		 if(obj instanceof EqualsM) {
			 EqualsM e=(EqualsM)obj;
			 if(nm.equals(e.nm)&& roll==e.roll) {
				 return true;
			 }
		 }
		return false;
	    }
	public static void main(String[] args) {
		EqualsM e1 = new EqualsM("Vaibhav", 20);
		EqualsM e2 = new EqualsM("Vaibhav", 20);
		EqualsM e3 = new EqualsM("Atul", 40);
		EqualsM e4 = e1;

		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
		System.out.println(e1.equals(e4));
	}
}
