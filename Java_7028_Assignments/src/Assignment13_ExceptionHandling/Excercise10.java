package Assignment13_ExceptionHandling;

public class Excercise10 {
	//Multiple catch blocks
	public static void main(String[] args) {
		int array[] = {10,20,30,40};
		int num1 =15, num2 = 0;
		int sum = 0;
		
		try {
			sum = num1/num2;
			System.out.println("The result is: "+sum);
			for(int i = 0; i < 10; i++) {
				System.out.println("The values of array are: "+array[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error 1: "+e);
		} catch(ArithmeticException e) {
			System.out.println("Error 2: "+e);
		}
	}
}
