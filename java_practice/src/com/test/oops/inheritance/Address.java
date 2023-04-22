package com.test.oops.inheritance;

class Address{    
		String city;
		String state;
		String country;
		
		public Address(String city, String state, String country) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
		}

		void display(){
			System.out.println(city +" "+state+" "+country);  }
			
		
}

