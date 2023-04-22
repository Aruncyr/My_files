package com.test.javastrings;

import java.util.*;

public class StringTokenizerExample2 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my,name,is,khan");
		System.out.println("Next order is:" + st.nextToken(","));
	}

}
