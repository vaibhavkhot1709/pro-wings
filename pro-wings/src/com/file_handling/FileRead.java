package com.file_handling;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String arg[]) {

		try {
			FileReader f1 = new FileReader("new2.txt");
			int i;

			while ((i = f1.read()) != -1) {

				System.out.print((char) i);
			}
		} catch (IOException e) {
			System.out.println("error");
		}

	}

}
