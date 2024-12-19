package Assignment4_Scanner_Class_Logical;
import java.util.Scanner;
public class Excercise3 {
	//WAP to add two characters
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:: ");
		char ch = sc.next().trim().charAt(0);
		System.out.println("Enter the integer:: ");
		int add = sc.nextInt();
		sc.close();
		int sum = ch+add;
		System.out.println("New character on adding the integer:: "+(char)sum+" and its ascii value:: "+sum);
	}
}
