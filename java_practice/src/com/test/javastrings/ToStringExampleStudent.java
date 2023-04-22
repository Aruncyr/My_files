package com.test.javastrings;

public class ToStringExampleStudent {

	int rollno;
	String name;
	String city;

	ToStringExampleStudent(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public String toString() {// overriding the toString() method
		return rollno + " " + name + " " + city;
	}

	public static void main(String args[]) {
		ToStringExampleStudent s1 = new ToStringExampleStudent(101, "Raj", "lucknow");
		ToStringExampleStudent s2 = new ToStringExampleStudent(102, "Vijay", "ghaziabad");

		System.out.println(s1);// compiler writes here s1.toString()
		System.out.println(s2);// compiler writes here s2.toString()
	}
}
