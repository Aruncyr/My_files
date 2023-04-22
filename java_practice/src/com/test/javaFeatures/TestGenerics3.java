package com.test.javaFeatures;

//Wildcard in Java Generics example
//creating a method that accepts only child class of shape
import java.util.*;

class TestGenerics3 {
	public static void drawShapes(List<? extends Shape> lists) {
		for (Shape s : lists) {
			s.draw();// calling method of Shape class by child class instance
		}
	}

	public static void main(String args[]) {
		List<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle());

		List<Circle> list2 = new ArrayList<Circle>();
		list2.add(new Circle());
		list2.add(new Circle());

		drawShapes(list1);
		drawShapes(list2);
	}
}
