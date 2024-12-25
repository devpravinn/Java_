package Assignment14_Arrays;

import java.util.Scanner;

public class Excercise16 {
	//Program to accept array input from the user and displaying it
	public static void main(String[] args) {
		int [] a = new int [10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 integers to store it in an array: ");
		for(int i = 0; i < a.length;i++) {
			a[i] =  sc.nextInt();
		}
		
		//Displaying the array
		System.out.println("You have entered");
		for(int i = 0; i < 10;i++) {
			System.out.println(a[i]);
		}
	}
}
