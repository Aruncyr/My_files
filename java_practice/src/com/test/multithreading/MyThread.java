package com.test.multithreading;
//using thread class: thread(string name)
class MyThread {

	public static void main(String[] args) {
		Thread t1 = new Thread("My first thread");
		t1.start();
		String str = t1.getName();
		System.out.println(str);
	}

}
