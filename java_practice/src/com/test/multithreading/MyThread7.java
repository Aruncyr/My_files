package com.test.multithreading;

class MyThread7 extends Thread {
	Table2 t;

	MyThread7(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable2(100);
	}
}
