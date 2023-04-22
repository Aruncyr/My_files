package com.test.multithreading;

//isinterrupting and interrupted method
public class TestInterruptingThread2 extends Thread {
	public void run() {
		for (int i = 1; i <= 2; i++) {
			if (Thread.interrupted()) {
				System.out.println("code for interrupted thread");
			} else {
				System.out.println("code for normal thread");
			}

		} // end of for loop
	}

	public static void main(String args[]) {

		TestInterruptingThread2 t1 = new TestInterruptingThread2();
		TestInterruptingThread2 t2 = new TestInterruptingThread2();

		t1.start();
		t1.interrupt();

		t2.start();

	}
}
