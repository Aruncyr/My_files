package com.test.javaFeatures;

// main method inside the enum
enum Season1 {
	FALL, SPRING, SUMMER, ;
	public static void main(String[] args) {
		Season1 s = Season1.FALL;
		System.out.println(s);
	}
}
