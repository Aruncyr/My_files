package com.test.javaio;

import java.io.*;

public class ByteArrayOutputStreamExample1 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout1 = new FileOutputStream("d:\\JAVA_PRACTICE\\javadoc\\f1.txt");
		FileOutputStream fout2 = new FileOutputStream("d:\\JAVA_PRACTICE\\javadoc\\f2.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.flush();
		bout.close();
		System.out.println("Success...");
	}

}
