package Assignment15_Strings.Homework;

import java.util.Arrays;

public class Excercise11 {
	//How to split a string into multiple substrings:
	//Using the split method
	public static void main(String[] args) {
		String input = "My name is Pravin Singh";
		String [] split = input.split(" ");
//		You can split on basis of comma, space, . , etc
		System.out.println(Arrays.toString(split));
	}
}
