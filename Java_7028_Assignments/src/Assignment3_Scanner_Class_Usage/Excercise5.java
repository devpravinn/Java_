package Assignment3_Scanner_Class_Usage;

import java.util.Scanner;

public class Excercise5 {
	//WAP to take input from the user and display it on the screen
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("The number entered by user is:: "+num);
	}
}
