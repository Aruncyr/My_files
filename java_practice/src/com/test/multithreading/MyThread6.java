package com.test.multithreading;

class MyThread6 extends Thread {
	Table2 t;

	MyThread6(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable2(5);
	}
}
