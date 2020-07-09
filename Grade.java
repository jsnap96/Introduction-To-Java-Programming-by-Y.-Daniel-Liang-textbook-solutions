
import java.util.Scanner;


public class Grade {

	public static void main(String[] args) {
		// Chapter 4 section 4.14 This program asks the user for a letter grade and displays the corresponding number 
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter a letter grade");
		String ch = scan.next();
		
		char letter = ch.charAt(0);
		
		
		if(letter == 'A')
		{
			
			System.out.print("The corresponding number is 4");
			
			
		}
		
		
		if(letter =='B')
		{
			
			System.out.print("The corresponding number is 3");
			
			
		}
		
		
		if(letter =='C')
		{
			
			System.out.print("The corresponding number is 2");
			
			
		}
		
		
		if(letter =='D')
		{
			
			System.out.print("The corresponding number is 1");
			
			
		}
		
		
		if(letter == 'F' || letter == 'f')
		{
			
			System.out.print("The corresponding number is 0");
			
			
		}
		
		 
		
		if(letter!= 'A'|| letter!= 'B' || letter!='C' || letter!= 'D')
		{
			System.out.print(letter);
			System.out.print(" is an invalid grade");
			return;
			
		}
		

	} //END of main

}
