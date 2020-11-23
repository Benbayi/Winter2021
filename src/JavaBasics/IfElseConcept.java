package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b =20;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		
		int c = 30;
		int d =15;
		
		if(d>c) {
			System.out.println("d is greater than c");
		}
		else {
			System.out.println("c is greater than d");
		}
	
		//comparison operators:
		// < > <= >= == !=
		
		int e = 40;
		int f= 50;
		if (e==f) {
			System.out.println("e and f are equal");
	
		}
		else {
			System.out.println("e and f are not equal");
		}
		
		//write a logic to find out the highest number
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		//nested if-else
		
		if(a1>b1 & a1>c1) {	//false and false equals to false
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else {
			System.out.println("c1 is the greatest");
		}
		
		int a2 = 400;
		int b2 = 200;
		int c2 = 300;
		
		//nested if-else
		
		if(a2>b2 & a2>c2) {	//True and true equals true
			System.out.println("a2 is the greatest");
		}
		else if(b2>c2) {
			System.out.println("b2 is the greatest");
		}
		else {
			System.out.println("c2 is the greatest");
		}
		
		
		int a3 = 400;
		int b3 = 500;
		int c3 = 300;
		
		//nested if-else
		
		if(a3>b3 & a3>c3) {	//false and true equals to true
			System.out.println("a3 is the greatest");
		}
		else if(b3>c3) {
			System.out.println("b3 is the greatest");
		}
		else {
			System.out.println("c3 is the greatest");
		}
		
		
		
	}

}
