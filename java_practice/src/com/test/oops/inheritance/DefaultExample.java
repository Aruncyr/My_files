package com.test.oops.inheritance;

public interface DefaultExample {
	void display();
	default void sayHello(){
		System.out.println("default");
	}
}
