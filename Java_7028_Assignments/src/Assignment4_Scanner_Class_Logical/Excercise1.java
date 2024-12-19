package Assignment4_Scanner_Class_Logical;

import java.util.Scanner;

public class Excercise1 {
	public static void main(String[] args) {
		//WAP to calculate the average of two numbers use double as data type.
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		sc.close();
		double average = (num1+num2)/2;
		System.out.println("Average of these two numbers is: "+average);
	}
}
