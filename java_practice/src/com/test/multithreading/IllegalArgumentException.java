package com.test.multithreading;

class IllegalArgumentException extends Thread {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(17);
		System.out.println("Priority of the main thread is:" + Thread.currentThread().getPriority());
	}

}
