package day4;

import java.util.Scanner;

public class EMICalculator {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner (System.in);
		
		System.out.println("Enter loan amount in USD");
		double principal = scanner.nextDouble(); //the value of P
		
		System.out.println("Enter annual interest rate (in %)");
		double annualInterestRate = scanner.nextDouble();
		
		System.out.println("Enter loan tenure  in years");
		int tenureYears = scanner.nextInt();
		
		int tenureMonths = tenureYears*12; // the value of n
		
		double monthlyInterestRate = annualInterestRate/(12*100); // the value of r
		
			
	// EMI Formula EMI = P x R x (1+R)^N / [(1+R)^N-1]. P: represents the principal loan amount.
	//	R: is the monthly interest rate, N: is the total number of monthly payments or the loan tenure in months.
	
		double emi = (principal*monthlyInterestRate*Math.pow(1+ monthlyInterestRate, tenureMonths))
					/ (Math.pow(1+ monthlyInterestRate, tenureMonths)-1);
	
		System.out.println("Your monthly EMI is: "+emi);
		
		
	
		scanner.close();

	

	}

}
