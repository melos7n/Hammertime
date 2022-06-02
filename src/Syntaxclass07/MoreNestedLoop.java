package Syntaxclass07;

public class MoreNestedLoop {

	public static void main (String[] args) {
		
		for(int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				
				System.out.println(x+" x "+y+" + "+(x*y));
				
						//1x1=1
						//1x2=2 etc etc
				
				System.out.println("--------------");
			}
		}
	}
}
