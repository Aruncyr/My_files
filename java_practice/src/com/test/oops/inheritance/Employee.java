package com.test.oops.inheritance;

class Employee {
	int id;
	String name;
	Address Address;

	Employee(int id, String name, Address Address) {
		this.id = id;
		this.name = name;
		this.Address = Address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println( Address.city +" "+Address.state+" "+Address.country);  }
}
