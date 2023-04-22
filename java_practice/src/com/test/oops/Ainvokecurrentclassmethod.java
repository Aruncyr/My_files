package com.test.oops;

public class Ainvokecurrentclassmethod {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		this.m();
	}

	public static void main(String[] args) {
		Ainvokecurrentclassmethod a = new Ainvokecurrentclassmethod();
		a.n();
	}

}
