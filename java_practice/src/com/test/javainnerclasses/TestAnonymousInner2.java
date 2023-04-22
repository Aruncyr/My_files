package com.test.javainnerclasses;
//anonymous inner class example using interface
public class TestAnonymousInner2 {
	public static void main(String args[]){  
		 Eatable e=new Eatable(){  
		  public void eat(){System.out.println("nice fruits");}  
		 };  
		 e.eat();  
		 }  
		}  
