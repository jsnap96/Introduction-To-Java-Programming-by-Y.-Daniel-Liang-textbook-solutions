import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		// problem 6.20 which counts the letters and numbers in a string using public static int countLetters(String s)
		
		Scanner scan = new Scanner(System.in);
		
	
		
		System.out.print("Enter a string");
		
		
		String one  = scan.nextLine();
		
		countLetters(one);
		
		
		

	}
	
	
	public static int countLetters(String s)
	
	{
		
		
		int length = s.length();
		
		char [] arr;
		
		arr = new char [length];
		int count =0;
		
		
		for(int i=0; i<s.length(); i++)
		{
			
		   count++;
			
			
		} 
		
		System.out.print("The length of the string is:" + count);
		
		return count;
	}

}
