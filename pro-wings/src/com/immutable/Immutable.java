package com.immutable;
public class Immutable {
	public static void main(String[] args) {
		Address a1=new Address(416213, "Kolhapur");
		Student s1=new Student(12, a1);
		System.out.println("before "+s1);
		a1.setPin(1234);
		a1.setCity("pune");
		System.out.println("after "+s1);
	}
}
final class Student{
	private final int roll;
	private final Address add;
	Student(int roll, Address add){
		this.roll=roll;
		Address ad=new Address();
		ad.setPin(add.getPin());
		ad.setCity(add.getCity());
		this.add=ad;
	}
	public int getRoll() {
		return roll;
	}
	public Address getAdd() {
		return add;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", add=" + add + "]";
	}
	
}

class Address {
	int pin;
	String city;

	Address(int pin, String city) {
		this.pin = pin;
		this.city = city;
	}
	Address() {
	
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	
}
