package com.streams;

import java.io.*;

public class StandardInputStream {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = null;

		try {
			reader = new InputStreamReader(System.in);
			char c;
			System.out.println("Enter char");
			do {
				c = (char) reader.read();
				System.out.println(c);
			} while (c != 'q');
		} finally {
			if (reader != null)
				reader.close();
			System.out.println("Stream closed !! bbye.");
		}
	}
}
