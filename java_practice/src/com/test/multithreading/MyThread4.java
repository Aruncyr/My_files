package com.test.multithreading;

public class MyThread4 extends Thread{
	Table1 t;

	MyThread4(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable1(5);
	}
}
