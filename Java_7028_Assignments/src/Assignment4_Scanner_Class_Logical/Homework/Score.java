package Assignment4_Scanner_Class_Logical.Homework;

import java.util.Scanner;

public class Score {
	//WAP to calculate the score of student and give them divisions
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your score:: ");
		int score = sc.nextInt();
		sc.close();
		if(score>= 60) {
			System.out.println("First Division");
		} else if(score >=50 && score <=59) {
			System.out.println("Second Division");
		} else if(score >=40 && score <=49) {
			System.out.println("Third Division");
		} else {
			System.out.println("Fail");
		}
	}
}
