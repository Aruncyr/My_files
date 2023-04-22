package com.test.javaFeatures;

import java.util.Scanner;

public class AssertionExample {
	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ur age ");

		int value = scanner.nextInt();
		assert value >= 18 : " Not valid";

		System.out.println("value is " + value);
	}
}
// assertions are disabled by default use this program in command prompt for
// output fully.
// use Compile it by: javac AssertionExample.java
// Run it by: java -ea AssertionExample
