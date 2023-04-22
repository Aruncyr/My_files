package com.test.javastrings;

import java.util.StringTokenizer;

public class NextElementsExampleStringTokenizer {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello everyone have a nice day", " ");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}

}
