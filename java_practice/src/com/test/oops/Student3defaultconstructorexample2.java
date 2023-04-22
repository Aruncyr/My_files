package com.test.oops;

public class Student3defaultconstructorexample2 {
	int id;
	String name;

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student3defaultconstructorexample2 s1 = new Student3defaultconstructorexample2();
		Student3defaultconstructorexample2 s2 = new Student3defaultconstructorexample2();
		s1.display();
		s2.display();
	}

}
