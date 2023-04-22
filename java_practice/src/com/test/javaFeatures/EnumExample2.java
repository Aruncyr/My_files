package com.test.javaFeatures;

// enum example : defined outside class
enum Season {
	WINTER, SPRING, SUMMER, FALL
}

class EnumExample2 {
	public static void main(String[] args) {
		Season s = Season.WINTER;
		System.out.println(s);
	}
}
