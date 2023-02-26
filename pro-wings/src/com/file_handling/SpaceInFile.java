package com.file_handling;

import java.io.FileReader;
import java.io.IOException;

public class SpaceInFile {

	public static void main(String arg[]) {

		int i;
		int count = 0;
		try {
			FileReader f1 = new FileReader("new2.txt");

			while ((i = f1.read()) != -1) {

				System.out.print((char) i);
				if(i==32) {
					count++;
				}
			}
			System.out.println("\n count of blank is " +count);
		} catch (IOException e) {
			System.out.println("error");
		}

	}

}
