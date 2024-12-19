package Assignment4_Scanner_Class_Logical.Homework;

import java.util.Scanner;

public class Compound_Interest {
	//WAP to calculate the compound interest
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount:: ");
		double principle_Amount = sc.nextDouble();
		System.out.println("Enter the rate of interest:: ");
		double rate_Of_Interest = sc.nextDouble();
		rate_Of_Interest/=100;
		System.out.println("Enter the number of times the interest is compounded:: ");
		double number_Of_Times_Interest_Is_Compounded = sc.nextDouble();
		System.out.println("Enter the number of years:: ");
		int number_Of_Years = sc.nextInt();		
		sc.close();
		double total_Amount = principle_Amount*(Math.pow((1+(rate_Of_Interest/number_Of_Times_Interest_Is_Compounded)),number_Of_Times_Interest_Is_Compounded*number_Of_Years));
		double compound_Interest = total_Amount- principle_Amount;
		System.out.println("Compound Interest is:: "+compound_Interest);
	}
}
