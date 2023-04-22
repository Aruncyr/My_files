package com.test.javaFeatures;

import java.util.function.Predicate;

public class PredicateInterfaceExample2 {
	static Boolean CheckAge(int age) {
		if (age > 17)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// using predicate interface
		Predicate<Integer> predicate = a -> (a > 18);
		// calling predicate method
		boolean result = predicate.test(25);
		System.out.println(result);
	}
}
