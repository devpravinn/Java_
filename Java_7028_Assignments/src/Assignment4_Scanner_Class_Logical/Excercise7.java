package Assignment4_Scanner_Class_Logical;

import java.util.Scanner;

public class Excercise7 {
	//WAP to calculate area and circumference of the circle
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:: ");
		double radius = sc.nextDouble();
		sc.close();
		double area = Math.PI*radius*radius;
		double circumference = 2 * Math.PI * radius;
		System.out.println("Area of the circle is:: "+area);
		System.out.println("Circumference of the circle is:: "+circumference);
	}
}
