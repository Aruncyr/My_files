package com.test.javaFeatures;

//example of AutoBoxing where widening beats boxing 
public class BoxingExample2 {
	static void m(int i) {
		System.out.println("int");
	}

	static void m(Integer i) {
		System.out.println("Integer");
	}

	public static void main(String args[]) {
		short s = 30;
		m(s);
	}
}
