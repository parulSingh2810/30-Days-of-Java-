package com.accenture.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		
//		FileOutputStream fout= new FileOutputStream("src/File/greeting",true);
		FileOutputStream fout = new FileOutputStream("src/File/greeting", true);
		
		
//		fout.write(System.lineSeparator().getBytes());
		String message = "Be on time ";
		fout.write(message.getBytes());
		fout.flush();
		System.out.println("data written to file");
		
		
	}
}
