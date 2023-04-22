package com.test.multithreading;

//using synchronization method
public class TestSynchronization2 {
	public static void main(String[]args){
		Table1 obj = new Table1();//only one object  
		MyThread4 t1=new MyThread4(obj);  
		MyThread5 t2=new MyThread5(obj);  
		t1.start();  
		t2.start();
	}  
}