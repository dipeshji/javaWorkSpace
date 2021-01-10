package com.streams;

import java.io.*;

public class ReadAndWrite {
	public static void main(String[] args) {
		try {
			byte writeBuffer[] = { 10, 20, 30, 40 };

			OutputStream os = new FileOutputStream("/home/dipesh/Documents/java_workspace/code/destination.txt");
			for (byte b : writeBuffer) {
				os.write(b);
			}

			InputStream is = new FileInputStream("/home/dipesh/Documents/java_workspace/code/source.txt");
			int size = is.available();

			for (int i = 0; i < size; i++) {
				System.out.println((char) is.read() + "  ");
			}

			os.close();
			is.close();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
