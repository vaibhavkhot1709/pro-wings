package com.pojo;

public class GetterSetter1 {

	private String name; // private = restricted access
	private int age;
	private int contact;
	private String city;
	
	// Getter
	public String getName() {
		return name;
	}
	// Setter
	public void setName(String newName) {
		this.name = newName;
	}

}
