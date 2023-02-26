package com.file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
public static void main(String arg[]){
		
		try{
			
			FileWriter f1=new FileWriter("new.txt");
			f1.write("hii good evening");
			f1.close();
			System.out.println(" file get created");
		}
		catch(IOException e){
			System.out.println(" file error");
		}
		
	}

}
