package Assignment3_Scanner_Class_Usage;

import java.util.Scanner;

public class Excercise3 {
	//WAP to take input from user then calculate the product and display the output on the screen.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		sc.close();
		int product = num1*num2;
		System.out.println("Product of these numbers is: "+product);
	}
}
