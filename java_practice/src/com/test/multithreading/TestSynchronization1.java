package com.test.multithreading;
//problem without synchronization
public class TestSynchronization1 {

	public static void main(String[] args) {
		Table obj = new Table();// only one object
		MyThread2 t1 = new MyThread2(obj);
		MyThread3 t2 = new MyThread3(obj);
		t1.start();
		t2.start();
	}
}
