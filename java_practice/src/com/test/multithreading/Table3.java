package com.test.multithreading;

//example of static synchronization
class Table3 {
	synchronized static void printTable3(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}
