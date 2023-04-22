package com.test.javaio;

import java.io.*;

public class DataOutputStreamExample1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("d:\\JAVA_PRACTICE\\javadoc\\testout.txt");
		DataOutputStream data = new DataOutputStream(file);
		data.writeInt(66);
		data.flush();
		data.close();
		System.out.println("Success...");
	}

}
