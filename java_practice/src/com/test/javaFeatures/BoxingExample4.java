package com.test.javaFeatures;

// Example of Autoboxing where boxing beats varargs
public class BoxingExample4 {
	static void m(Integer i) {
		System.out.println("Integer");
	}

	static void m(Integer... i) {
		System.out.println("Integer...");
	}

	public static void main(String args[]) {
		int a = 30;
		m(a);
	}
}
