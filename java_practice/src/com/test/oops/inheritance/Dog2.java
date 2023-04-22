package com.test.oops.inheritance;

class Dog2 extends Animal2 {
	String colour = "Black";

	void printcolour() {
		System.out.println(colour);
		System.out.println(super.colour);
	}

	public static void main(String[] args) {
		Dog2 d2 = new Dog2();
		d2.printcolour();
	}
}
