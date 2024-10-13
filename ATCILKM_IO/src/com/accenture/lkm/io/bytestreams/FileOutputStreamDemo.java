package com.accenture.lkm.io.bytestreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void write() throws FileNotFoundException, IOException {
		try (FileOutputStream fout = new FileOutputStream("src/files/Greeting.txt", true);) {

			fout.write(System.lineSeparator().getBytes());
			String message = "Good Morning..!!";
			fout.write(message.getBytes());
			fout.flush();
			System.out.println("data written to file");

		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		write();
	}
}
