package STUDY;

public class BooleanInJava {
	public static void main (String[] args ) {
		
		int a=0;
		
	Boolean b=a==0;  //boolean can only be true or false, also anything that results to true or false.
					// a==0 this means if "a" is equal to zero. 
					// since integer =0, the boolean statement a==0 means if "b" =0 then it is true
					//boolean are for "if" statements 
	System.out.println(b);
	
	boolean passedDoor=true;
	boolean missedDoor=false;
	boolean passedAllDoors =false;
	int doorCount=0;
	
		if(passedDoor) {
		System.out.println("We passed the first door!");
			doorCount= doorCount+ 1;
		}
		if(passedDoor) {
		System.out.println("We passed the second door!");
		doorCount= doorCount+1;
		
			}
			
		if(passedDoor) {
		System.out.println("We passed the third door!");
		doorCount= doorCount+ 1;
		}
		
		if(doorCount==3) {
			passedAllDoors=true;
		}
		if(passedAllDoors){
			System.out.println("Congratulations you won the program!");
		
		
			
			
	
	
	
	}
	
	
	}
	

}
