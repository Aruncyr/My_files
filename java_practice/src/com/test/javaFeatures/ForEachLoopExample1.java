package com.test.javaFeatures;

//only traversing the elements
public class ForEachLoopExample1 {
	public static void main(String args[]) {
		// declaring an array
		int arr[] = { 12, 13, 14, 44 };
		// traversing the array with for-each loop
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
