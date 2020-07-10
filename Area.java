import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		/* This program calculates the area of a pentagon and asks the user to enter the length from the center of a pentagon to a vertex and 
		computes the area of the pentagon Chapter 4 problem 4.1 */
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Enter the side");
		
		double side = scan.nextDouble();
		
		double length = 2*side*Math.sin(Math.PI/5);

		double Area = (5*length*length)/(4*Math.tan(Math.PI/5));
		
		
		System.out.print("The area of the Pentagon is " + String.format("%.2f", Area));

	}

}
