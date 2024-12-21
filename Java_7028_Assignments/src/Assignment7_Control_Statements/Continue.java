package Assignment7_Control_Statements;

public class Continue {
	public static void main(String[] args) {
		//WAP to skip odd numbers and print even numbers
		for(int i = 1; i <15; i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
