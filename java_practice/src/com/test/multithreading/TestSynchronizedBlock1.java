package com.test.multithreading;

public class TestSynchronizedBlock1 {
	public static void main(String args[]) {
		Table2 obj = new Table2();// only one object
		MyThread6 t1 = new MyThread6(obj);
		MyThread7 t2 = new MyThread7(obj);
		t1.start();
		t2.start();
	}
}
