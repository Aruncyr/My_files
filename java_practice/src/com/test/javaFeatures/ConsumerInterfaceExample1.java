package com.test.javaFeatures;

import java.util.function.Consumer;

public class ConsumerInterfaceExample1 {
	static void printMessage(String name) {
		System.out.println("Hello" + name);

	}

	static void printvalue(int val) {
		System.out.println(val);
	}

	public static void main(String[] args) {
		// referring method to string type consumer interface
		Consumer<String> consumer1 = ConsumerInterfaceExample1::printMessage;
		consumer1.accept("john");
		// referring method to integer type consumer interface
		Consumer<Integer> consumer2 = ConsumerInterfaceExample1::printvalue;
		consumer2.accept(12); // Calling Consumer method
	}
}
