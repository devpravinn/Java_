package Assignment3_Scanner_Class_Usage;

import java.util.Scanner;

public class Excercise2 {
	//WAP for taking input from user then calculates the subtraction and display output on screen
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		sc.close();
		int sub = num1 - num2;
		System.out.println("Subtraction result: "+sub);
	}
}
