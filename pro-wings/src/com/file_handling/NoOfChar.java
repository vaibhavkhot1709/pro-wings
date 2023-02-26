package com.file_handling;

import java.io.FileReader;
import java.io.IOException;

public class NoOfChar {

	public static void main(String arg[]) {

		int i,counta = 0,counte=0,counti=0,counto=0,countu=0;
		try {
			FileReader f1 = new FileReader("new2.txt");

			while ((i = f1.read()) != -1) {

				System.out.print((char) i);
				if(i=='a') {
					counta++;
				}
				if(i=='e') {
					counte++;
				}
				if(i=='i') {
					counti++;
				}
				if(i=='o') {
					counto++;
				}
				if(i=='u') {
					countu++;
				}
			}
			System.out.println("\n\n count of a  is  " +counta);
			System.out.println("\n count of e is   " +counte);
			System.out.println("\n count of i is   " +counti);
			System.out.println("\n count of o is   " +counto);
			System.out.println("\n count of u is   " +countu);

		} catch (IOException e) {
			System.out.println("error");
		}

	}

}
