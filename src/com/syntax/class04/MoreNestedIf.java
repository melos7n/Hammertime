package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* we need to check if repl was completed
		 * 
		 * if is completed we want to see
		 * if you did 15 or more- great
		 * if you did 10 or more-good
		 * less than 10- try and do all
		 * 
		 * 
		 */
		
		
		boolean didRepl=false;
				int assignments;
		
		if (didRepl) {
			
			System.out.println("How many assignments have you done");
			assignments=17;
			
			if (assignments >15) {
				System.out.println("You did a great job");
			}else if (assignments >10) {
					System.out.println("You did a good job");
			}else {
				System.out.println("Please complete all repl assignments");
			}
		}else { 
			
			System.out.println("You should complete your Repl HW");
			
			
			
			
			
			
		}
		
	}

}
