package com.test.oops;

public class Studentstaticvariableexample {
	int rollno;
	String name;
	static String college = "ITS";

	Studentstaticvariableexample(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
	public static void main(String args[]) {
		Studentstaticvariableexample s1 = new Studentstaticvariableexample(111, "Karan");
		Studentstaticvariableexample s2 = new Studentstaticvariableexample(222, "Aryan");

		s1.display();
		s2.display();
	}
}
