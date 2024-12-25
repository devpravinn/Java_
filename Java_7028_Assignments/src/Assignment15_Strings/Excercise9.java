package Assignment15_Strings;

import java.util.Scanner;

public class Excercise9 {
	public static void main(String[] args) {
		String input = "JavaByKiran 2021 Java Classes";
		Scanner sc = new Scanner(input).useDelimiter("\\s");
		//Scanner class with delimiter. The \s represents whitespace.
		System.out.println(sc.next());
		System.out.println(sc.nextInt());
		System.out.println(sc.next());
		System.out.println(sc.next());
		
	}
}
