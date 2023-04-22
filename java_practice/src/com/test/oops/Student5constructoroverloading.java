package com.test.oops;

public class Student5constructoroverloading {
	int id;
	String name;
	int age;

	Student5constructoroverloading(int i, String n) {
		id = i;
		name = n;
	}

	Student5constructoroverloading(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String[] args) {
		Student5constructoroverloading s1 = new Student5constructoroverloading(111, "Karan");
		Student5constructoroverloading s2 = new Student5constructoroverloading(222, "aryan", 25);
		s1.display();
		s2.display();
	}

}
