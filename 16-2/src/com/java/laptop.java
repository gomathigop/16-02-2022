package com.java;

	public class laptop {
		String model;
		String colour;
		double price;
		public laptop()
		{
			model="Lenovo";
			colour="Grey";
			price=45009.23;
			
		}
		public void getlaptop()
		{
			System.out.println("laptop model="+model);
			System.out.println("laptop colour="+colour);
			System.out.println("laptop price="+price);
			
		}
		public static void main(String[] args) {
			laptop  laptopdetails= new laptop();
			laptopdetails.getlaptop();
		}
		
		
		

	}

