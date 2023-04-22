package com.test.multithreading;

//naming thread without using setName()method
import java.io.*;

@SuppressWarnings("unused")
class ThreadName extends Thread {
	ThreadName(String threadName) {
		super(threadName);
	}

	public void run() {
		System.out.println("The Thread is executing...");
	}
}
