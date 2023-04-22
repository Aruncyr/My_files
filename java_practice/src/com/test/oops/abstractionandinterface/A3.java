package com.test.oops.abstractionandinterface;

class A3 implements Printable2, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		A3 obj = new A3();
		obj.print();
		obj.show();
	}
}