package com.test.javainnerclasses;
//java member inner class example
public class TestMemberOuter1 {
	private int data = 30;

	class inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String[] args) {
		TestMemberOuter1 obj = new TestMemberOuter1();
		TestMemberOuter1.inner in = obj.new inner();
		in.msg();
	}
}