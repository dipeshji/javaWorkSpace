package com.streams;

import java.io.*;

public class CharStreamCopyOperation {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("/home/dipesh/Documents/java_workspace/code/source.txt");
			fw = new FileWriter("/home/dipesh/Documents/java_workspace/code/destination.txt");

			int c;
			while ((c = fr.read()) != -1) {
				System.out.println((char) c);
				fw.write(c);
			}
		} finally {
			if (fr != null && fw != null) {
				fr.close();
				fw.close();
			}
		}
	}
}
