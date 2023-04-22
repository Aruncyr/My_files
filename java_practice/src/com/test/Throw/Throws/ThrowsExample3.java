package com.test.Throw.Throws;

//Declare Exception
import java.io.*;

class P {
	void method() throws IOException {
		System.out.println("device operation performed");
	}
}

class ThrowsExample3 {
	public static void main(String args[]) throws IOException {// declare
																// exception
		P p = new P();
		p.method();

		System.out.println("normal flow...");
	}
}
