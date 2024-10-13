package com.accenture.streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		// TODO Auto-generated method stub
		try(FileInputStream Fin = new FileInputStream("src/File/User");
		BufferedInputStream bin = new BufferedInputStream(Fin);){
		 byte data[] = new byte[bin.available()];
				while(bin.read(data)!= -1) {
					System.out.println(new String (data));
				}
		
	

	}
	}



}
