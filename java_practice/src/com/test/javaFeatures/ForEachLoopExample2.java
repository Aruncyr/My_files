package com.test.javaFeatures;

//adding the elements for a total
public class ForEachLoopExample2 {
	public static void main(String args[]) {
		int arr[] = { 12, 13, 14, 44 };
		int total = 0;
		for (int i : arr) {
			total = total + i;
		}
		System.out.println("Total: " + total);
	}
}
