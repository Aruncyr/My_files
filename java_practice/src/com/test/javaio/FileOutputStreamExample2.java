package com.test.javaio;

//writing string in testout.txtfile
import java.io.FileOutputStream;

public class FileOutputStreamExample2 {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\JAVA_PRACTICE\\javadoc\\testout.txt");
			String s = ("Welcome To JavaTPoint");
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
