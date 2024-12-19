package Assignment4_Scanner_Class_Logical;

import java.util.Scanner;

public class Excercise5 {
	//WAP to calculate the area of a rectangle
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:: ");
		int length = sc.nextInt();
		System.out.println("Enter the width of the rectanlge:: ");
		int width = sc.nextInt();
		sc.close();
		int area = length*width;
		System.out.println("Area of the rectangle is :: "+area);
	}
}
