package com.test.javastrings;

import java.util.StringTokenizer;

public class CountTokensExampleStringTokenizer {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello Everyone have a nice day"," ");
		System.out.println("Total Number of Tokens:" + st.countTokens());
	}

}
