package Assignment3_Scanner_Class_Usage;

import java.util.Scanner;

public class Excercise4 {
	//WAP to input two numbers from the users and calculate their division.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the first number: ");
		int num2 = sc.nextInt();
		sc.close();
		int product = num1/num2;
		System.out.println("Division of these two numbers is: "+product);
	}
}
