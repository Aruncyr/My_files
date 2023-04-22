package com.test.javaFeatures;

// example if a functional interface is extending to a non-functional interface
public class FunctionalInterfaceExample2 implements Sayable2 {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();
		fie.say("Hello there");
		fie.doIt();
	}
}
