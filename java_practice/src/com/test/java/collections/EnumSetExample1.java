package com.test.java.collections;

import java.util.*;

public class EnumSetExample1 {
	public static void main(String[] args) {
		Set<Days> set = EnumSet.of(Days.TUESDAY, Days.WEDNESDAY);
		// Traversing elements
		Iterator<Days> iter = set.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}
}
