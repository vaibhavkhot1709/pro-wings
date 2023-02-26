package com.object_class2;

import java.util.Objects;

public class EqualsM2 {
	int i;
	String nm;
	
	EqualsM2(){
		
	}
	
	EqualsM2(int i, String nm){
		this.i=i;
		this.nm=nm;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsM2 other = (EqualsM2) obj;
		return i == other.i && Objects.equals(nm, other.nm);
	}
	
	public static void main(String[] args) {
		
		EqualsM2 e1=new EqualsM2(10, "Vk");
		EqualsM2 e2=new EqualsM2(10, "VK");
		EqualsM2 e3=e1;
		
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e3));
	}
}