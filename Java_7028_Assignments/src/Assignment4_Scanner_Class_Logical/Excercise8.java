package Assignment4_Scanner_Class_Logical;

import java.util.Scanner;

public class Excercise8 {
	//WAP to calculate the area of a square
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square:: ");
		double side = sc.nextDouble();
		sc.close();
		double area = side*side;
		System.out.println("Area of square is:: "+area);
	}
}
