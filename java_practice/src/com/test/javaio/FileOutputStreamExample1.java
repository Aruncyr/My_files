package com.test.javaio;
//writing byte in testout.txtfile
import java.io.FileOutputStream;

public class FileOutputStreamExample1 {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\JAVA_PRACTICE\\javadoc\\testout.txt");
			fout.write(65);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
