package com.test.javaFeatures;

import java.util.function.Predicate;

public class PredicateInterfaceExample1 {
	public static void main(String[] args) {
		Predicate<Integer> pr = a -> (a > 18);
		System.out.println(pr.test(10));
	}
}
