package com.test.oops;

public class Studentstaticmethodexample {
	int rollno;
	String name;
	static String college = "ITS";

	static void change() {
		college = "BBDIT";
	}

	Studentstaticmethodexample(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String[] args) {
		Studentstaticmethodexample.change();
		Studentstaticmethodexample s1 = new Studentstaticmethodexample(111, "karan");
		Studentstaticmethodexample s2 = new Studentstaticmethodexample(222, "aryan");
		Studentstaticmethodexample s3 = new Studentstaticmethodexample(333, "sonu");
		s1.display();
		s2.display();
		s3.display();
	}

}
