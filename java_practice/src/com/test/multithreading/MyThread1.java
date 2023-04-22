package com.test.multithreading;

// for shutdown hook
class MyThread1 extends Thread {
	public void run() {
		System.out.println("shutdown hook task completed...");
	}
}
