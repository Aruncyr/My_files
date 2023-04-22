package com.test.java.collections;

//you can't add duplicate values in HashMap
import java.util.*;

public class HashMapExample2 {
	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating
																		// HashMap
		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(1, "Grapes"); // trying duplicate key

		System.out.println("Iterating Hashmap...");
		for (@SuppressWarnings("rawtypes") Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
