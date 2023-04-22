package com.test.javaFeatures;
//Type Inference and Generic Constructors

public class TypeInferenceExample2 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		GenericClass<String> gc2 = new GenericClass<>("Hello");
	}
}
