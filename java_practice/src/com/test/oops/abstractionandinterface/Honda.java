package com.test.oops.abstractionandinterface;

class Honda extends Bike2 {
	void run() {
		System.out.println("running safely");
	}

	public static void main(String[] args) {
		Bike2 obj = new Honda();
		obj.run();
	}
}
