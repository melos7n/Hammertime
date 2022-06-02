package STUDY;

import java.util.Scanner;

public class WhatIfStatements {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a grade:");
		
		int n= scan.nextInt();
		System.out.println(n);
		
		if( n >= 90 && n <=100) { // no parentheses
			
			// we can connect each conditions by using &&
		// here is for an A letter grade. 
		//the statement is saying if n is 90 or greater or if n is 100 or less than its an A
		// if we put true instead of the specific guidelines then when run it will always be true
		// same if the statement was false.
			
		System.out.println("A");   
		
	// if we additional conditions I can just add else if
		
		} else if (n >=80 && n <90) {
			System.out.println("B");
			
		} else if(n >=70 && n <80) {
			System.out.println("C");
			
		} else if(n >=65 && n <70) {
			System.out.println("D");
			
		} else if(n >=0 && n <65) {
			System.out.println("F");

		} else {
			System.out.println("The number you entered is not in the range");
		}
		
	
	
		
		
	}
}
