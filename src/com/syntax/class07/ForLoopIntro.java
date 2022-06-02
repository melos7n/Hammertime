package com.syntax.class07;

public class ForLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//I want to say GM 5 times.
		
		for (int i=1; i<=5; i++) {
			System.out.println("Good Morning"); //5
		}
		System.out.println("-----------------------");
			
			for(int i=1; i<=5; i++) {
				System.out.println("How are you ");//0
				
			}
			System.out.println("-----------------------");
			
			/*
				for (int i=1; i<=5; i--) {
					System.out.println("hello"); // infinite
					}
					*/
			
			System.out.println("-----------------------");
			
			for(int i60; i>=10;i--) {
				System.out.println("-----------------------");
				
				System.out.println();
				
				for(int i=5; i<=40; i+=5) {
					System.out.println(i+"");
			}
		}
			
	}

}
