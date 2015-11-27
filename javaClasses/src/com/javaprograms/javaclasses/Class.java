package com.javaprograms.javaclasses;

public class Class {

	public static void main(String[] args) {
		
		//Class name, variable name
		Cup myCup = new Cup();
		Cup secondCup = new Cup();
		
		myCup.color = "Blue";
		myCup.capacity = 234;
		
		secondCup.color = "White";
		secondCup.capacity = 123;
		
		System.out.println("Cup color is: " + myCup.color + " " + myCup.capacity);
		
		
		System.out.println("My new cup is : " + secondCup.capacity + " " + secondCup.color);
		
		secondCup.shatter();
		
		
		
		
	}

}
