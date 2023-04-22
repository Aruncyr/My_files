package com.test.javainnerclasses;
//anonymous inner class example using class
public class TestAnonymousInner1 {
	public static void main(String args[]) {
		Person p = new Person() {
			void eat() {
				System.out.println("nice fruits");
			}
		};
		p.eat();
	}
}
