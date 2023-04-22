package com.test.javastringmethod;

public class GetCharsExample {

	public static void main(String[] args) {
		String str = new String("hello javapoint how are you");
		char[] ch = new char[10];
		try {
			str.getChars(6, 16, ch, 0);
			System.out.println(ch);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
