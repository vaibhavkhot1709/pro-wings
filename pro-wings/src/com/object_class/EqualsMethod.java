package com.object_class;

import java.util.Objects;

public class EqualsMethod {
	int i;
	String nm;

	EqualsMethod(int i, String nm) {
		this.i = i;
		this.nm = nm;
	}

	public static void main(String[] args) {
		EqualsMethod e1 = new EqualsMethod(10, "durga");
		EqualsMethod e2 = new EqualsMethod(20, "durga");
		EqualsMethod e3 = new EqualsMethod(10, "durga");
		EqualsMethod e4 = new EqualsMethod(20, "durga 33");
		EqualsMethod e5 = new EqualsMethod(0, null);

		System.out.println(e1.equals(e2));
//		here object class method get called which check reference only 
//		so to check content we have to override equals(); method in our class..

		System.out.println(e1.nm.equals(e2.nm));// check only nm so true is result

		System.out.println(e1.i == (e2.i));//// check only int i so false is result

		System.out.println(e1.nm.equals(e2.nm));// check only nm so true is result

		System.out.println(e1.equals(e3));// it checks content so result is true...

		System.out.println(e1.equals(e5));// value is null so result is false...

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsMethod other = (EqualsMethod) obj;
		return i == other.i && Objects.equals(nm, other.nm);
	}
}