package Assignment5_Packages.Package_A;

import Assignment5_Packages.Package_B.B;

//using inbuilt class of another package
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		B b = new B();
		b.m1();
		
		//Using fully classified class name
		Assignment5_Packages.Addition.Add ad = new Assignment5_Packages.Addition.Add();
		ad.add(2, 4);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("Number entered by the user is:: "+num);
		
		Cricket ck = new Cricket();
		ck.display();
		
		Assignment5_Packages.Package_B.A aa = new Assignment5_Packages.Package_B.A();
		aa.m2();
	}
}
