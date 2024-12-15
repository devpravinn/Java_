package Assignment3_Scanner_Class_Usage;

import java.util.Scanner;

public class Excercise6 {
	//WAP to take two different types of inputs from the user and display it on the screen
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:: ");
		int num = sc.nextInt();
		System.out.println("Enter a string:: ");
		String input = sc.next();
		System.out.println("Enter a character:: ");
		char ch = sc.next().trim().charAt(0);
		System.out.println("Enter a floating point number:: ");
		double in = sc.nextDouble();
		sc.close();
		
		System.out.println("Integer number entered:: "+num);
		System.out.println("String entered:: "+input);
		System.out.println("Character entered:: "+ch);
		System.out.println("Floating point number entered:: " + in);
	}
}
