package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="Oleg"; // all non primitives should start with upper case

		String lastName="Smith";
		
		long phone=123456789; //xxx-xxx-xxxx
		
		String phoneNumber="123-456-7890";
		String address="123 Washington Street";
		
		String age="30";
		String city="Miami";
		
		/*when we want to attach String to String we can use plus sign.
		 * 
		 */
		
			System.out.println(name+" "+lastName);  // shortcut=syso +control=space=enter
		
			System.out.println(name+" lives in "+city);
			System.out.println(name+" is "+age+ " years old");
		
	}

}
