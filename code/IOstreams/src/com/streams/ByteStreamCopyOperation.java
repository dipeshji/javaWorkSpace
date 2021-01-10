package com.streams;

import java.io.*;

public class ByteStreamCopyOperation {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("/home/dipesh/Documents/java_workspace/code/source.txt");
			out = new FileOutputStream("/home/dipesh/Documents/java_workspace/code/destination.txt");

			int c;
			while ((c = in.read()) != -1) {
				System.out.println((char)c);
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}