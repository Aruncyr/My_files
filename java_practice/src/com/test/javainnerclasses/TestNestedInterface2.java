package com.test.javainnerclasses;

//nested interface which is declared within the class
public class TestNestedInterface2 implements A.Message {
	public void msg() {
		System.out.println("Hello nested interface");
	}

	public static void main(String args[]) {
		A.Message message = new TestNestedInterface2();// upcasting here
		message.msg();
	}
}
