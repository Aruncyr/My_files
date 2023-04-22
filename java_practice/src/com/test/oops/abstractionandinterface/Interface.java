package com.test.oops.abstractionandinterface;

interface A {
	void a();

	void b();

	void c();

	void d();
}

abstract class B implements A {
	public void c() {
		System.out.println("i am c");
	}
}