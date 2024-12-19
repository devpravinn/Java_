package Assignment4_Scanner_Class_Logical.Homework;

import java.util.Scanner;

public class Cube {
	//WAP to calculate the cube of a number using scanner class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:: ");
		int num = sc.nextInt();
		sc.close();
		int cube = num*num*num;
		System.out.println("Cube of the number is:: "+cube);
	}
}
