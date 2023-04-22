package com.test.javastrings;

public final class ImmutableExampleEmployee {
	public static void main(String[] args) {
		Employee e = new Employee("ABC123");
		String s1 = e.getPancardNumber();
		System.out.println("Pancard Number: " + s1);

	}

}
