package STUDY;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		String[] fruits = new String[4]; // this is an array
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Strawberry";	// for arrays you have to know exact size or it wont run. 
		fruits[3] = "Watermelon";   // better for smaller lists/ know how many
		System.out.println(fruits[1]);
		
		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");   // an array list has no cap
		fruitList.add("Watermelon");
		fruitList.remove("Strawberry");
		fruitList.clear();           // saves time, space, more flexible, can add or subtract, see if contain what im looking for
		
		System.out.println(fruitList.contains("Raspberry"));
		System.out.println(fruitList);
		
		
		
		
	}
}
