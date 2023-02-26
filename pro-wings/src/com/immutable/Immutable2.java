package com.immutable;

public class Immutable2 {
	public static void main(String[] args) {
		Addresss add=new Addresss(1234, "savarde");
		Studentt s=new Studentt(12,add);
		System.out.println("before "+s);
		add.setCity("shahuwadi");
		add.setPin(9876);
		System.out.println("after "+s);
	}
}

class Studentt{
	private final int roll;
	private final Addresss add;

	public Studentt(int roll, Addresss add) {
		super();
		this.roll = roll;
		Addresss a=new Addresss();
		a.setCity(add.getCity());
		a.setPin(add.getPin());
		this.add=a;
		
	}

	public int getRoll() {
		return roll;
	}

	public Addresss getAdd() {
		return add;
	}

	@Override
	public String toString() {
		return "Studentt [roll=" + roll + ", add=" + add + "]";
	}
	
}

class Addresss{
	int pin; 
	String city;
	
	Addresss(){
		super();
	}
	
	Addresss(int pin, String city){
		this.pin=pin;
		this.city=city;
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
		return "Addresss [pin=" + pin + ", city=" + city + "]";
	}
	
}
