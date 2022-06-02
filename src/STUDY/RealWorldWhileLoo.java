package STUDY;

import java.util.ArrayList;
import java.util.Scanner;

public class RealWorldWhileLoo {

	public static void main(String[] args)  { // if we want to get a all the words in a sentence 
												// and store them in array we can use a while loop
		
		String sentence = "flapjacks are awesome!"; //goal to store these words in a data structure in a arraylist. 
		Scanner scan = new Scanner(sentence);  // to get each word, tells scanner we'll be using sentence for our words//
		ArrayList<String> words = new ArrayList<String>();//import arraylist 
		
		while(scan.hasNext()) {  // stored with while loop to go one word at a time til end
			words.add(scan.next()); // what this does is scan each word to make the list. scans, grabs word, scans again etc.
			
		}
				
				System.out.println(words);
				
			}
			
			
			
			
	
		
		
		
	}
