package com.accenture.streams;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputstreamDemo {
	public static void main (String[] args) throws FileNotFoundException, IOException {
		try( FileOutputStream Fin = new FileOutputStream("src/File/User");
				BufferedOutputStream bin = new BufferedOutputStream(Fin);)
		{
			
			
		}
	}

}
