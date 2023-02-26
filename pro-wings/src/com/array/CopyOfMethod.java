package com.array;

import java.util.Arrays;

public class CopyOfMethod {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3 };

		for (int i = 0; i < num.length; i++)
			System.out.print(" " +num[i]);

		int[] num2 = Arrays.copyOf(num, 5);

		// adding some elements of copy
		num2[3] = 11;
		num2[4] = 55;

		System.out.println("\n\n new array is");
		for (int n : num2) {
			System.out.println(" " +n);
		}
	}
}
