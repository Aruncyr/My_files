package com.test.oops.inheritance;

class Aggregationexample {
	public static void main(String[]args){
	  Address address1 =  new Address("Hyd","Ts","india");  
		Address address2 = new Address("Hyd","Ts","india");  
		  
	Employee e1=new Employee(111,"kumar",address1);  
	Employee e2=new Employee(222,"sai",address2); 
	e1.display();  
	e2.display();
}
}
