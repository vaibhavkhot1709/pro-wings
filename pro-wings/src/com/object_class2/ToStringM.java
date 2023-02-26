package com.object_class2;
class A {                  
	int re, im;

	public A(int re, int im) {
		this.re = re;
		this.im = im;
	}
}
//here we not override toString method so it result hashCode
public class ToStringM extends A {
	public ToStringM(int re, int im) {
		super(re, im);
	}
	public String toString() {
		return re + "  and " + im;

	}
	public static void main(String[] args) {
		A a = new A(10, 15);
		A a1 = new A(20, 40);
		ToStringM t1 = new ToStringM(20, 30);

		System.out.println(a);
		System.out.println(a.toString()); // this both are give same result i.e.A@5e265ba4
		
// after override toString method it gives our actual result as below
		System.out.println(t1.toString());
		System.out.println(t1);
	}
}
