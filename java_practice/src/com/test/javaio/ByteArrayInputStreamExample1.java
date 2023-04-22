package com.test.javaio;

import java.io.*;

public class ByteArrayInputStreamExample1 {
	public static void main(String[] args) throws IOException {
		byte[] buf = { 35, 36, 37, 38 };
		// create new byte array stream
		ByteArrayInputStream byt = new ByteArrayInputStream(buf);
		int k = 0;
		while ((k = byt.read()) != -1) {
			// conversion of byte into character
			char ch = (char) k;
			System.out.println("ASCII value of character is:" + k + ";Special character is:" + ch);
		}

	}
}
