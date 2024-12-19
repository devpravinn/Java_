package Assignment4_Scanner_Class_Logical;
import java.util.Scanner;
public class Excercise2 {
	//WAP to understand ASCII code of characters
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().trim().charAt(0);
		sc.close();
		System.out.println("ASCII Value of "+ch+" is:: "+(int)ch);
	}
	
}
