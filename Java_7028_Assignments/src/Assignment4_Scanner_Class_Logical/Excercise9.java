package Assignment4_Scanner_Class_Logical;

import java.util.Scanner;

public class Excercise9 {
	//WAP to calculate the square of an area using scanner
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square:: ");
		int side = sc.nextInt();
		sc.close();
		int area = side*side;
		System.out.println("Area of square is:: "+area);
	}
}
