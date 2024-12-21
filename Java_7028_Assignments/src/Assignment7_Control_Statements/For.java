package Assignment7_Control_Statements;

import java.util.Iterator;

public class For {
	public static void main(String[] args) {
		//WAP to check odd numbers between 1 and 100
		for(int i = 1; i < 100; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}
}
