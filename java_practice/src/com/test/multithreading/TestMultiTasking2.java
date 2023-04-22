package com.test.multithreading;

//performing multiple tasks by multipleThreads
public class TestMultiTasking2 {

	public static void main(String[] args) {
		Simple1 t1 = new Simple1();
		Simple2 t2 = new Simple2();
		t1.start();
		t2.start();
	}

}
