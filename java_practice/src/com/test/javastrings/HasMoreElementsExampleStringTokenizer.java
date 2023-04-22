package com.test.javastrings;

import java.util.StringTokenizer;

public class HasMoreElementsExampleStringTokenizer {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello everyone i am a java developer", " ");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());

		}
	}
}
