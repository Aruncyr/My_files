package com.test.multithreading;

//How to shutdown system in Java
public class RunTime2 {
	public static void main(String args[]) throws Exception {
		Runtime.getRuntime().exec("shutdown -s -t 0");
	}
}
