package com.test.javaFeatures;

import java.io.FileOutputStream;

public class TryWithResource {
	public static void main(String args[]) {
		// Using try-with-resources
		try (FileOutputStream fileOutputStream = new FileOutputStream("/JAVA_PRACTICE/javadoc/abc.txt")) {
			String msg = "Welcome to javaTpoint!";
			byte byteArray[] = msg.getBytes(); // converting string into byte
												// array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly!");
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}
