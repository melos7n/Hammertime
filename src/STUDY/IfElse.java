package STUDY;

import java.util.Scanner;

public class IfElse {


		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a grade:");
		
		int n = scan.nextInt();  //my guess this is the portion that creates the entering aspect on the console?
		System.out.println(n);
		
		if(n>=90 && n <=100) {    // if is the initial start of the if else if statements
			System.out.println("A"); 
		
		} else if(n>=80 && n<90) {	// Else if is the following steps
			System.out.println("B");
			
		} else if(n >=70 && n< 80) {
			System.out.println("c");
			
	}else if(n >=65 && n <70) {
		System.out.println("D");
		
	}else if(n < 65) {
		System.out.println("F");
		
	} else {
		System.out.println("The number you entered is not in the range");
		
		
	}
	}
	}
