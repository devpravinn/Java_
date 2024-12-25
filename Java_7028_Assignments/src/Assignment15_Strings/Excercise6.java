package Assignment15_Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Excercise6 {
	//Program to take input from keyboard
	public static void main(String[] args) throws Exception {
		InputStreamReader r = new InputStreamReader(System.in);
		//BufferedReader stream with InputStreamReader
		
		BufferedReader br = new BufferedReader(r);
		//reading the line by line data from the keyboard.
		
		System.out.println("Enter your name: ");
		String name = br.readLine();
		System.out.println("Welcome "+name);
	}
}
