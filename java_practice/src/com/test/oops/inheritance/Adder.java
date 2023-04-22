package com.test.oops.inheritance;

class Adder implements DefaultExample {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
		Adder a = new Adder();
		a.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}