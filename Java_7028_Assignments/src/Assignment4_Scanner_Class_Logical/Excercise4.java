package Assignment4_Scanner_Class_Logical;

import java.util.Scanner;

public class Excercise4 {
	//WAP to find the perimeter of a rectangle
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:: ");
		int length = sc.nextInt();		
		System.out.println("Enter the width of the rectangle:: ");
		int width = sc.nextInt();
		sc.close();
		int perimeter = 2*(length+width);
		System.out.println("Perimeter of rectangle is:: "+perimeter);
		
	}
}
