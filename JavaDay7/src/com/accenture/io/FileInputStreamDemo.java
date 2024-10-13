package com.accenture.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
//		FileInputStream Fis = new FileInputStream("src/File/greeting");
//		int ch;
//		while((ch= Fis.read() )!=-1)
//		{
//			System.out.println((char)ch);
//			
//		}
		FileInputStream Fis = new FileInputStream("src/File/greeting");
		int ch;
		while((ch = Fis.read())!= -1);
		{
			System.out.println((char)ch);
		}
		
		
		
		
		
		
	}
}
