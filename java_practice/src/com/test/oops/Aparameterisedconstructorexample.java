package com.test.oops;

public class Aparameterisedconstructorexample {
	Aparameterisedconstructorexample() {
		System.out.println("hello a");
	}

	Aparameterisedconstructorexample(int x) {
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Aparameterisedconstructorexample a = new Aparameterisedconstructorexample(10);
	}
}
