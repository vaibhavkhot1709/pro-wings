 package com.object_class2;

public class FinalizeClass {
	int id;
	String nm;
	
	FinalizeClass(int id, String nm){
		this.id=id;
		this.nm=nm;
	}
//	public String toString() {
//		return id+"..."+nm;
//	}
	
	public static void main(String[] args) {
		FinalizeClass fc1=new FinalizeClass(10, "Vaibhav");
		fc1=new FinalizeClass(20,"AP");
		System.out.println(fc1.id+".." +fc1.nm);
		System.gc();
	}
//	no result so we create finalize method to see the result;
//if you override this method then it not works proper so dont override it
//	protected void finalize() throws Throwable {
//		System.out.println("inside finalize");
//		System.out.println(this);
//		super.finalize();
//		
//	}
	
}
