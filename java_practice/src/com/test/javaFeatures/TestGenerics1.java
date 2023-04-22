package com.test.javaFeatures;

//using array list class you can also use hashMap,linkedSet,treeSet,comparator
import java.util.*;

public class TestGenerics1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("jai");
		// list.add(32);//compile time error

		String s = list.get(1);// type casting is not required
		System.out.println("element is: " + s);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}