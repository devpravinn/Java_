package Assignment4_Scanner_Class_Logical.Homework;

import java.util.Scanner;

public class Simple_Interest {
	//WAP to calculate the simple interest
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount:: ");
		double principal_Amount = sc.nextDouble();
		System.out.println("Enter the rate of interest:: ");
		double rate_Of_Interest = sc.nextDouble();
		System.out.println("Enter the number of years:: ");
		int number_Of_Years = sc.nextInt();
		sc.close();
		double simple_Interest = (principal_Amount*rate_Of_Interest*number_Of_Years)/100;
		System.out.println("The simple interest is:: "+simple_Interest);
	}
}
