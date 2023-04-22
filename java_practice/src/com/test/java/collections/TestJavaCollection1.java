package com.test.java.collections;
//Array list example using iterator
import java.util.*;

class TestJavaCollection1 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add("Ravi");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
