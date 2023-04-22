package com.test.java.collections;

//Traversing elements in descending order
import java.util.*;

class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ajay");
		System.out.println("Traversing element through Iterator in descending order");
		@SuppressWarnings("rawtypes")
		Iterator i = set.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
