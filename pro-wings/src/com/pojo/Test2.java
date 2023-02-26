package com.pojo;

public class Test2 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();

		t1.setAge(20);
		t1.setName("Vaibhav");
//		System.out.println(t1.getAge());
//		System.out.println(t1.getName());
		
		int num1 = 21;
		int num2 = 20;

		int age= (num1>=18) ? num1+num2: num2-num1;
		System.out.println(age);

	}

}
