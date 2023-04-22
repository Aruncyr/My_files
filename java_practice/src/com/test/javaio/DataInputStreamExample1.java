package com.test.javaio;

import java.io.*;

public class DataInputStreamExample1 {

	public static void main(String[] args) throws IOException {
		InputStream Input = new FileInputStream("d:\\JAVA_PRACTICE\\javadoc\\testout.txt");
		@SuppressWarnings("resource")
		DataInputStream inst = new DataInputStream(Input);
		int count = Input.available();
		byte[] ary = new byte[count];
		inst.read(ary);
		for (byte bt : ary) {
			char k = (char) bt;
			System.out.print(k+"-");
		}
	}

}
