
import java.util.Scanner;
import java.lang.Math;


public class Test2 {
	
	
	
	
		
	
	

	public static void main(String[] args) {
		// Chapter 4 section 4
		// This program takes in a side and computes the area of a hexagon
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Enter the side");
		
		double side = scan.nextDouble();
		
		double Area = (6*side*side) / (4*Math.tan(Math.PI/6));
		
		
		
		
		System.out.print("The area of the hexagon is " + String.format("%.2f", Area));
		
	
		
		
		
		
	}
	
	
}