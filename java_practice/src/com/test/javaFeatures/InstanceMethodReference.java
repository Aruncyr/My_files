package com.test.javaFeatures;

public class InstanceMethodReference {
	public void printnMsg() {
		System.out.println("Hello, this is instance method");
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(new InstanceMethodReference()::printnMsg);
		t2.start();
	}
}
