package com.test.java.collections;

import java.util.*;

public class ArrayToList {

	public static void main(String[] args) {
		String[] Array = { "java", "python", "PHP", "c++" };
		System.out.println("Printing Array:" + Arrays.toString(Array));
		List<String> list = new ArrayList<String>();
		for (String lang : Array) {
			list.add(lang);
		}
		System.out.println("Printing List: " + list);

	}
}
