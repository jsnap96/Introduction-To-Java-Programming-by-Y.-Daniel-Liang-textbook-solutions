import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		/* 6.34 creating a method to calculate the area of a pentagon. 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Enter the side");
		
		double side = scan.nextDouble();
		
		
		area(side);
		
	}
	
	public static double area(double side)
	{
		

		double Area = (5*side*side)/(4*Math.tan(Math.PI/5));
		
		
		System.out.print("The area of the Pentagon is " + String.format("%.2f", Area));

		return Area;
		
	}


	}


