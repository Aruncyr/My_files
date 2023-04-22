package com.test.javaFeatures;

//example if a functional interface is extending to a non-functional interface
interface Doable {
	default void doIt() {
		System.out.println("Do it now");
	}
}
