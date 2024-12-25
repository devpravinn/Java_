package Assignment15_Strings;

import java.util.Scanner;

public class Excercise8 {
	//Scanner class which reads int, string,double as input.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your roll number: ");
		int rollno = sc.nextInt();
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your fee");
		double fee = sc.nextDouble();
		System.out.println("-----------------------");
		System.out.println("Roll no: "+rollno+"\nname:"+name+"\nfee:"+fee);
		
		sc.close();
	}
}
