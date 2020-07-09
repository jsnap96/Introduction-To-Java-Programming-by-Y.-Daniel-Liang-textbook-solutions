import java.util.Scanner;

public class Payrollch4 {

	public static void main(String[] args) {
		/*
		 * 
		 *  This program reads an employee name, number of hours worked, the pay rate , federal tax withholding rate and 
		 *  the state tax withholding rate. It will display the Net pay after the deductions 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter emoloyee's name");
		String name = scan.nextLine();
		
		
		System.out.print("Enter the number of hours worked in a week:");
		int hours = scan.nextInt();
		
		
		
		System.out.print("Enter the hourly payrate");
		double pay_rate = scan.nextDouble();
		
		
		
		System.out.print("Enter the federal tax withholding rate:");
		
		double fed_with = scan.nextDouble();
		
		
		System.out.print("Enter the state tax withholding rate:");
		double state_with = scan.nextDouble();
		
		double gross = pay_rate*hours;
		
		System.out.println("Employee name: " + name );
		System.out.println("Hours worked" +hours);
		System.out.println("Pay rate " + pay_rate);
		System.out.println("Gross pay" + gross);
		System.out.println("Deductions:");
		
		
		
		double total_fed = gross * fed_with;
		
		
		
		
		
		double total_state = gross * state_with;
		System.out.println("\t Federal Withholding: $" + total_fed);
		System.out.println("\t State withholding: $" + String.format("%.2f",total_state));
		
		double total_deduction = total_fed+total_state;
		
		System.out.println("\t Total Deduction: $" + String.format("%.2f",total_deduction));
		
		double net = gross - total_deduction;
		
		System.out.println("Net pay: $" + String.format("%.2f", net));
		
		
		
		
		

		
		
	}

}
