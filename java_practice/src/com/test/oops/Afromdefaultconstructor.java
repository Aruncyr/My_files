package com.test.oops;

public class Afromdefaultconstructor {
	Afromdefaultconstructor() {
		this(5);
		System.out.println("hello a");
	}

	Afromdefaultconstructor(int x) {
		System.out.println(x);
	}
	public static void main(String args[]) {
		@SuppressWarnings("unused")
		Afromdefaultconstructor a = new Afromdefaultconstructor();

	}

}
