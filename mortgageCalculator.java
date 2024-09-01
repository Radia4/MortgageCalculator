package MortgageCalculator;

import java.util.Scanner;

public class mortgageCalculator {
	


	public static void main(String[] args) {
		
		// Create a scanner object to read user input
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to input the principal loan amount
		System.out.print("Principal: ");
		Double Principal = scanner.nextDouble();
		
		// Prompt the user to input the annual interest rate
		System.out.print("Annual Interest Rate: " ); 
		double annualInterestRate = scanner.nextDouble();
		 // Convert annual interest rate to a monthly interest rate
		double monthlyInterestRate = annualInterestRate / 100 / 12;
		
		 // Prompt the user to input the loan period in years
		System.out.print("Period (Years): ");
		int Period = scanner.nextInt();
		// Convert the loan period in years to the number of monthly payments
		int numberOfPayments = Period * 12;
		
		 // Calculate the mortgage using the formula for a fixed-rate mortgage
		Double Mortgage = Principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) 
				/ (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
		
		// Output the calculated mortgage amount, formatted to two decimal places
		System.out.println("Your mortgage rate is $" + String.format("%.2f", Mortgage));
		
	}

}
