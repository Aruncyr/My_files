package com.test.multithreading;

//java thread example by extending thread class
class Multi extends Thread {

	public void run() {
		System.out.println("thread is running....");
	}

	public static void main(String[] args) {
		Multi t1 = new Multi();
		t1.start();
	}
}
