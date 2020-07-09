import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
		/* This program asks the user to enter the number of sides 
		 * and their length of a regular polygon and display the area.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter the number of sides:");
		int num_of_sides = scan.nextInt();
		
		
		
		System.out.println("Enter the side");
		double side = scan.nextDouble();
		
		
		
		double Area = (num_of_sides * side *side) /(4*Math.tan(Math.PI/num_of_sides));
		
		System.out.println("The area of the polygon is " + String.format("%.2f", Area));
		
		

	}

}
