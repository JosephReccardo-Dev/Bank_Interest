// Chapter 6 Example while Loop Exercise

import java.util.Scanner;

public class BankBalance
{
	public static void main(String[] args) 
	{
		//Variables and Constants
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);

		//Input Phase
		System.out.print("Please enter initial bank balance: ");
		balance = keyboard.nextDouble();
		System.out.println("Would you like to see next years balance?");
		System.out.print("Please enter '1' for 'YES' or any other number for 'NO': ");
		response = keyboard.nextInt();

		//Processing and output phases
		while(response == 1) //This will only loop if the user enters the number 1 to answer 'yes' to the question of seeing next years balance.
		{
			balance = balance + (balance * INT_RATE);
			System.out.println("\nAfter year " + year+ " at " + INT_RATE+ " interest rate, balance is $" +balance);
			year = year + 1;
			System.out.println("\nWould you like to see next years balance?");
			System.out.print("Please enter '1' for 'YES' or any other number for 'NO': ");
			response = keyboard.nextInt();
		} //End of while loop

		// Final sign-off statement after the looping is done
		System.out.println("\nThank you for choosing our bank, have a great day!");
	}
}