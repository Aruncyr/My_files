package com.test.oops;

public class Student4parameterizedconstructorexample1 {
	int id;
	String name;

	Student4parameterizedconstructorexample1(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student4parameterizedconstructorexample1 s1 = new Student4parameterizedconstructorexample1(111, "karan");
		Student4parameterizedconstructorexample1 s2 = new Student4parameterizedconstructorexample1(222, "aryan");
		s1.display();
		s2.display();
	}
}
