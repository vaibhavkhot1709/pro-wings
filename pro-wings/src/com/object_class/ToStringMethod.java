package com.object_class;

public class ToStringMethod {
	
	String nm;
	
	ToStringMethod(String nm){
		this.nm=nm;
	}
	
	public static void main(String[] args) {
		ToStringMethod ts1=new ToStringMethod("durga");
		
// here we are not override toString method of object class so it gives class name @ hex_dec
		System.out.println(ts1.toString());
		
//		 so we have to override this method for our own result as below
	}
	
	  public String toString() {
//		 here we override so it results durga....
	        return nm;
	    }
	

	

}
