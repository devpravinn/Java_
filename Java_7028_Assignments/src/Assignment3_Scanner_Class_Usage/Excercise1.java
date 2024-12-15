package Assignment3_Scanner_Class_Usage;

import java.util.Scanner;

public class Excercise1 {
	//WAP for taking input from user that calculates the sum and display the output on the screen
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first numnber: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println("Sum of these numbers is: " + sum);
		sc.close();//closing the scanner object after the usage is a good practice in my opinion.
		
	}
}
