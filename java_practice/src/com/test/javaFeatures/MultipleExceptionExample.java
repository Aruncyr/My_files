package com.test.javaFeatures;

//what java 7 provides us, you can use vertical bar (|)to separate exceptions in catch block
public class MultipleExceptionExample {
	public static void main(String args[]) {
		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
