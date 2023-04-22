package com.test.oops;

public class Studentwithoutthisexample {
	int rollno;
	String name;
	float fee;

	Studentwithoutthisexample(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		Studentwithoutthisexample s1 = new Studentwithoutthisexample(111, "ankit", 5000f);
		Studentwithoutthisexample s2 = new Studentwithoutthisexample(222, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
