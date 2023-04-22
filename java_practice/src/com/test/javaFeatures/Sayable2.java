package com.test.javaFeatures;

//example if a functional interface is extending to a non-functional interface
interface Sayable2 extends Doable {
	void say(String msg); // abstract method
}
