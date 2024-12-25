package Assignment13_ExceptionHandling;

public class Excercise4 {
	//Try catch example 4:
	//Nested try catch
	
	public static void main(String[] args) {
		try {
			//Inner try block1
			try {
				System.out.println("Inside block 1");
				int b = 45/0;
				System.out.println(b);
			} catch(ArithmeticException e1) {
				System.out.println("Exception e1: "+e1);
			}
			//Inner try block2
			try {
				System.out.println("Inside block 2");
				int b = 45/0;
				System.out.println(b);
			} catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Exception e2: "+e2);
			}
			System.out.println("Just another statement");
		} catch(ArithmeticException e3) {
			System.out.println("Arithmetic Exception");
			System.out.println("Inside parent try catch block");
		} catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Inside parent try catch block");
		} catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("Inside parent try catch block");
		}
		System.out.println("Next statement");
	}
	
}
