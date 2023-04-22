package com.test.multithreading;

//if we call Run()method directly instead of start()method 
public class TestCallRun extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TestCallRun t1 = new TestCallRun();
		TestCallRun t2 = new TestCallRun();
		t1.run();
		t2.run();
	}
	// As we can see in the above program that there is no context-switching
	// because here t1 and t2
	// will be treated as normal object not thread object.
}
