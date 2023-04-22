package com.test.javaFeatures;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample1 {
	static void ShowDetails(String name, Integer age) {
		System.out.println(name + " " + age);

	}

	public static void main(String[] args) {
		// referring method
		BiConsumer<String, Integer> biCon = BiConsumerInterfaceExample1::ShowDetails;
		biCon.accept("Rama", 20);
		biCon.accept("Shyam", 25);
		// using lambda expression
		BiConsumer<String, Integer> biCon2 = (name, age) -> System.out.println(name + " " + age);
		biCon2.accept("peter", 28);
	}
}
