package Assignment15_Strings.Homework;

import java.util.Scanner;

public class Excercise13 {
	//WAP to replace multiple character in a string.
	public static void main(String[] args) {
//		String input = "Welcome to Java Programming";
//		String result = input.replace('W', 'K').replace('e','o');
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String inp = sc.next();
		String operation="";
		String result=inp;
		do {
			System.out.println("Enter the character that you want to replace:");
			char ch = sc.next().trim().charAt(0);
			System.out.println("Enter the character that you want to replace with: ");
			char replace = sc.next().trim().charAt(0);
			result = result.replace(ch,replace);
			System.out.println("Do you want to stop? If no type no if yes type stop");
			operation = sc.next();
		}while(!operation.equalsIgnoreCase("Stop"));
		System.out.println("After all replacement operations the result comes out to be: "+result);
	}
}
