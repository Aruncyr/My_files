package com.test.javaio;

//reads data from 2 files and writes into another file
import java.io.*;

public class InputStream1 {

	public static void main(String args[]) throws Exception {
		FileInputStream fin1 = new FileInputStream("D:\\JAVA_PRACTICE\\javadoc\\testin1.txt");
		FileInputStream fin2 = new FileInputStream("D:\\JAVA_PRACTICE\\javadoc\\testin2.txt");
		FileOutputStream fout = new FileOutputStream("D:\\JAVA_PRACTICE\\javadoc\\testout.txt");
		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
		int i;
		while ((i = sis.read()) != -1) {
			fout.write(i);
		}
		sis.close();
		fout.close();
		fin1.close();
		fin2.close();
		System.out.println("Success..");
	}
}
