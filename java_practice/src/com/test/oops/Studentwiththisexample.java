package com.test.oops;

public class Studentwiththisexample {
	int rollno;
	String name;
	float fee;

	public Studentwiththisexample(int rollno, String name, float fee) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		Studentwiththisexample s1 = new Studentwiththisexample(111, "ankit", 5000f);
		Studentwiththisexample s2 = new Studentwiththisexample(222, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
