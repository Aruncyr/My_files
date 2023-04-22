package com.test.javaFeatures;
//reference to a static method
public class MethodReferenceExample1 {

	public static void saySomething() {
		System.out.println("Hello,this is a static method");
	}

	public static void main(String[] args) {
		Sayable sayable = MethodReferenceExample1::saySomething;
		sayable.say();
	}
}
