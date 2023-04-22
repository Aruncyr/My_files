package com.test.multithreading;

public class TestStaticSynchronization {
	public static void main(String t[]) {
		MyThread8 t1 = new MyThread8();
		MyThread9 t2 = new MyThread9();
		MyThread10 t3 = new MyThread10();
		MyThread11 t4 = new MyThread11();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
