package com.test.javaException;

public class ExceptionPropagationExample1 {
	void m() {
		@SuppressWarnings("unused")
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		ExceptionPropagationExample1 obj = new ExceptionPropagationExample1();
		obj.p();
		System.out.println("normal flow...");
	}
}