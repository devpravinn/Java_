package Assignment15_Strings.Homework;

import java.util.Scanner;

public class Excercise14 {
	//WAP to check if a string in java contains only white spaces
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		int countWhiteSpaces = 0;
		for(char c: input.toCharArray()) {
			if(c==' ') {
				countWhiteSpaces++;
			}
		}
		System.out.println("Total whitespace count in the string: "+countWhiteSpaces);
	}
}
