package com.test.java.collections;

//Tree set example using iterator
import java.util.*;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		// traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
