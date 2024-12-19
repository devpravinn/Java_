package Assignment4_Scanner_Class_Logical;

import java.util.Scanner;

public class Excercise6 {
	//WAP to calculate the area of rectangle using scanner class and double data type
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:: ");
		double length = sc.nextDouble();
		System.out.println("Enter the width of the rectangle:: ");
		double width = sc.nextDouble();
		sc.close();
		double area = length*width;
		System.out.println("Area of rectangle is:: "+area);
	}
}
