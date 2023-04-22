package com.test.javaFeatures;

//using BiFunction interface and its apply() method
import java.util.function.BiFunction;

public class MethodReferenceExample2 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
}
