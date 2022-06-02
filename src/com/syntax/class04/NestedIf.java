package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean vaccine=false;
		int dose=2;
		
		if(vaccine) {
			System.out.println("Let me check how many doses you have");
			
			if (dose==1) {
				System.out.println("You need 1 more shot");
			} else {
				System.out.println("You are fully vacinated");
				
				
			}
				
			}
		
		System.out.println("-------");
		
		String month="May";
		int day=8;
		
		if (month.equals("May")) {
			
			System.out.println("Let me check what is today's date");
			
			if (day==8) {
				System.out.println("Today is mother's day");
				
			}
			
		}else if (month.equals("June")) {
			
			
			System.out.println("Let me check what is today's date");
			
			if (day==19) {
				
				System.out.println("Today is a Father's day");
				
				
			}
			
		
		}
	}

}
