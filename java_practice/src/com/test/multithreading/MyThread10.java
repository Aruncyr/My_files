package com.test.multithreading;

class MyThread10 extends Thread {
	public void run() {
		Table3.printTable3(100);
	}
}
