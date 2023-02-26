package com.object_class;

public class FinalizeMethod {
	String nm1, nm2;

	FinalizeMethod(String nm1, String nm2) {
		this.nm1 = nm1;
		this.nm2 = nm2;
	}

	FinalizeMethod() {

	}

//	public String toString() {
//
//		return nm1 + "..." + nm2;
//	}
//
//	protected void finalize() throws Throwable {
//		System.out.println("hiiii");
//		System.out.println(this);
//		super.finalize();
////		for proper work we have to override toString method also
//
//	}
//	
	public static void main(String[] args) {
		FinalizeMethod fm1 = new FinalizeMethod("durga ", "durga 2");

		fm1 = new FinalizeMethod("vaibhav 1", "vaibhav 23");
		System.out.println(fm1.nm1 + " >>> " + fm1.nm2);
		System.gc(); // here gc method automatic call to finalize method
						// so 1st object get deleted and new object get print

//so for just our understanding we override finalize method and print some sms into that
	}

}
