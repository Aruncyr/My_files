package com.test.javastrings;

public class TestimmutableString {

	public static void main(String[] args) {
		String s = "sachin";
		s.concat("tendulkar");
		System.out.println(s);// will print sachin only because strings are
								// immutable
	}

}
