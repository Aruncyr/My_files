package com.test.oops.inheritance;

class Operator {
	int data = 50;

	void change(Operator op) {
		op.data = op.data + 100;
	}

	public static void main(String[] args) {
		Operator op = new Operator();
		System.out.println("before change" + op.data);
		op.change(op);
		System.out.println("after change" + op.data);
	}

}
