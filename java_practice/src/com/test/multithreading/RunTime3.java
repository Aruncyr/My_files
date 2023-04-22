package com.test.multithreading;

//How to restart system in Java
public class RunTime3 {
	public static void main(String args[]) throws Exception {
		Runtime.getRuntime().exec("shutdown -r -t 0");
	}
}
